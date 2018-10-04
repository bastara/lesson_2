package Calcultor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class StringCalculator {
    public static void main(String[] args) {
        run();
    }

    private static void run() {
        JFrame frame = new JFrame("String calculator");

        frame.setSize(600, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridBagLayout());

        JLabel inputLabel = new JLabel("Введите выражение");
        JLabel printLabel = new JLabel("Полученный резудьтат");

        final JTextField inputField = new JTextField(30);
        final JTextField printField = new JTextField();

        JButton myButton = new JButton("Рассчитать");
        JButton myButtonClear = new JButton("Очистить");


        frame.add(inputLabel, new GridBagConstraints(0, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTHEAST, GridBagConstraints.HORIZONTAL,
                new Insets(6, 12, 6, 12), 0, 0));
        frame.add(printLabel, new GridBagConstraints(0, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTHEAST, GridBagConstraints.HORIZONTAL,
                new Insets(6, 12, 6, 12), 0, 0));
        frame.add(inputField, new GridBagConstraints(0, 1, 2, 1, 2, 1,
                GridBagConstraints.NORTHEAST, GridBagConstraints.HORIZONTAL,
                new Insets(6, 12, 6, 12), 0, 0));
        frame.add(printField, new GridBagConstraints(0, 4, 2, 1, 2, 1,
                GridBagConstraints.SOUTHEAST, GridBagConstraints.HORIZONTAL,
                new Insets(6, 12, 6, 12), 0, 0));
        frame.add(myButton, new GridBagConstraints(3, 1, 1, 1, 0.5, 1,
                GridBagConstraints.NORTHWEST, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));
        frame.add(myButtonClear, new GridBagConstraints(3, 4, 1, 1, 0.5, 1,
                GridBagConstraints.SOUTHWEST, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        frame.setVisible(true);

        myButtonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText("");
                printField.setText("");

            }
        });

        myButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String stringNumber = inputField.getText();
                stringNumber = getInBrackets(stringNumber);

                //вывод результата
                String tmpNumber = inBrackets(stringNumber);
                String result = (tmpNumber.charAt(0) == '#') ? "-" + tmpNumber.substring(1) : tmpNumber;
                double convertToFullFormat = Double.parseDouble(result);
                NumberFormat nf = new DecimalFormat("#.#############");
                printField.setText(nf.format(convertToFullFormat));

            }
        });
    }

    private static String getInBrackets(String stringNumber) {

        char[] chArray = stringNumber.toCharArray();
        for (int i = 0; i < stringNumber.length(); i++) {
            if (stringNumber.charAt(i) == '-' && i == 0) {
                chArray[0] = '#';
            }
            if (stringNumber.charAt(i) == '(' && stringNumber.charAt(i + 1) == '-') {
                chArray[i + 1] = '#';
            }
        }
        stringNumber = String.copyValueOf(chArray);

        //определяем положение скобок если они есть
        int countBracket1 = 0;
        int countBracket2;
        String brackets;
        String tmpString;

        while (stringNumber.contains(")")) {//ищем позиции скобок
            countBracket2 = stringNumber.indexOf(")");
            for (int i = countBracket2; i >= 0; i--) {
                if (stringNumber.charAt(i) == '(') {
                    countBracket1 = i;
                    break;
                }
            }

            brackets = stringNumber.substring(countBracket1 + 1, countBracket2);
            int lengthArray = stringNumber.length();
            if (countBracket1 > 0) {
                tmpString = stringNumber.substring(0, countBracket1) + inBrackets(brackets);
                if (countBracket2 != lengthArray) {
                    stringNumber = tmpString + stringNumber.substring(countBracket2 + 1);
                }
            } else {
                tmpString = inBrackets(brackets);
                stringNumber = (countBracket2 != lengthArray) ? tmpString + stringNumber.substring(countBracket2 + 1) :
                        tmpString;
            }
        }
        return stringNumber;
    }


    private static String inBrackets(String str) {

        String expression = str;

        String inBracketsArr[] = expression.split("[-/*+]");
        double numArr[] = new double[inBracketsArr.length];
        for (int i = 0; i < inBracketsArr.length; i++) {
            if (inBracketsArr[i].contains("#")) {
                inBracketsArr[i] = inBracketsArr[i].substring(1);
                numArr[i] = Double.parseDouble(inBracketsArr[i]) * (-1);
                continue;
            }
            numArr[i] = Double.parseDouble(inBracketsArr[i]);
        }

        //создаем массив операций
        char[] singArr = new char[inBracketsArr.length];
        int count = 0;
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '+') {
                singArr[count] = '+';
                ++count;
            }
            if (expression.charAt(i) == '-') {
                singArr[count] = '-';
                ++count;
            }
            if (expression.charAt(i) == '*') {
                singArr[count] = '*';
                ++count;
            }
            if (expression.charAt(i) == '/') {
                singArr[count] = '/';
                ++count;
            }
        }

        //производим умножение и деление
        int countSing = 0;
        do {
            if (singArr[countSing] == '*') {
                numArr[countSing] = numArr[countSing] * numArr[countSing + 1];
                for (int k = countSing + 1; k < count; k++) {
                    numArr[k] = numArr[k + 1];
                    singArr[k - 1] = singArr[k];
                }
                --count;
            } else if (singArr[countSing] == '/') {
                numArr[countSing] = numArr[countSing] / numArr[countSing + 1];
                for (int k = countSing + 1; k < count; k++) {
                    numArr[k] = numArr[k + 1];
                    singArr[k - 1] = singArr[k];
                }
                --count;
            } else {
                countSing++;
            }
        } while (countSing < count);

        //производим сложение и вычитание
        countSing = 0;
        do {
            if (singArr[countSing] == '+') {
                numArr[countSing] = numArr[countSing] + numArr[countSing + 1];
                for (int k = countSing + 1; k < count; k++) {
                    numArr[k] = numArr[k + 1];
                    singArr[k - 1] = singArr[k];
                }
                --count;
            } else if (singArr[countSing] == '-') {
                numArr[countSing] = numArr[countSing] - numArr[countSing + 1];
                for (int k = countSing + 1; k < count; k++) {
                    numArr[k] = numArr[k + 1];
                    singArr[k - 1] = singArr[k];
                }
                --count;
            } else {
                countSing++;
            }
        } while (countSing < count);

        expression = (numArr[0] < 0) ? '#' + Double.toString(numArr[0] * (-1)) : Double.toString(numArr[0]);
        return expression;
    }
}
