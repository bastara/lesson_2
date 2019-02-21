package ru.cft.focusstart.kolobov.View;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    public Window() {
        JFrame frame = new JFrame("FocusStart calculator");

        frame.setSize(600, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();

//        JLabel inputLabel = new JLabel("Введите выражение");
//        JLabel printLabel = new JLabel("Полученный результат");
        JLabel equal = new JLabel("=");

        JTextField inputField = new JTextField(30);
        JTextField printField = new JTextField(15);
        printField.setEditable(false);

//        JButton myButton = new JButton("Рассчитать");
//        JButton myButtonClear = new JButton("Очистить");


        JButton myButton0 = new JButton("0");
        JButton myButton1 = new JButton("1");
        JButton myButton2 = new JButton("2");
        JButton myButton3 = new JButton("3");
        JButton myButton4 = new JButton("4");
        JButton myButton5 = new JButton("5");
        JButton myButton6 = new JButton("6");
        JButton myButton7 = new JButton("7");
        JButton myButton8 = new JButton("8");
        JButton myButton9 = new JButton("9");

        JButton myButtonSum = new JButton("+");
        JButton myButtonSub = new JButton("-");
        JButton myButtonMul = new JButton("*");
        JButton myButtonDiv = new JButton("/");
        JButton myButtonEqv = new JButton("=");
        JButton myButtonClear = new JButton("C");
        JButton myButtonLB = new JButton("(");
        JButton myButtonRB = new JButton(")");
        JButton myButtonPoint = new JButton(".");
        JButton myButtonDel = new JButton("del");


        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 5;
        c.insets = new Insets(6, 0, 6, 0);
        frame.add(inputField, c);

        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 5;
        frame.add(printField, c);

        c.insets = new Insets(6, 6, 6, 6);
        c.gridx = 0;
        c.gridy = 2;
        c.ipadx = 16;
        c.gridwidth = 1;
        frame.add(myButton7, c);

        c.gridx = 1;
        frame.add(myButton8, c);

        c.gridx = 2;
        frame.add(myButton9, c);

        c.gridx = 3;
        frame.add(myButtonSum, c);

        c.gridx = 4;
        frame.add(myButtonEqv, c);

        c.gridx = 0;
        c.gridy = 3;
        frame.add(myButton4, c);

        c.gridx = 1;
        frame.add(myButton5, c);

        c.gridx = 2;
        frame.add(myButton6, c);

        c.gridx = 3;
        frame.add(myButtonSub, c);

        c.gridx = 4;
        frame.add(myButtonClear, c);

        c.gridx = 0;
        c.gridy = 4;
        frame.add(myButton1, c);

        c.gridx = 1;
        frame.add(myButton2, c);

        c.gridx = 2;
        frame.add(myButton3, c);

        c.gridx = 3;
        frame.add(myButtonMul, c);

        c.gridx = 4;
        frame.add(myButtonLB, c);

        c.gridx = 1;
        c.gridy = 5;
        frame.add(myButton0, c);

        c.gridx = 0;
        frame.add(myButtonPoint, c);

        c.gridx = 2;
        frame.add(myButtonDel, c);

        c.gridx = 3;
        frame.add(myButtonDiv, c);

        c.gridx = 4;
        frame.add(myButtonRB, c);

        frame.setVisible(true);

        myButtonClear.addActionListener(e -> {
            inputField.setText("");
            printField.setText("");

        });

        myButton0.addActionListener(e -> {
            String stringNumber = inputField.getText();
            stringNumber += "0";
            inputField.setText(stringNumber);
        });

        myButton1.addActionListener(e -> {
            String stringNumber = inputField.getText();
            stringNumber += "1";
            inputField.setText(stringNumber);
        });

        myButton2.addActionListener(e -> {
            String stringNumber = inputField.getText();
            stringNumber += "2";
            inputField.setText(stringNumber);
        });

        myButton3.addActionListener(e -> {
            String stringNumber = inputField.getText();
            stringNumber += "3";
            inputField.setText(stringNumber);
        });

        myButton4.addActionListener(e -> {
            String stringNumber = inputField.getText();
            stringNumber += "4";
            inputField.setText(stringNumber);
        });

        myButton5.addActionListener(e -> {
            String stringNumber = inputField.getText();
            stringNumber += "5";
            inputField.setText(stringNumber);
        });

        myButton6.addActionListener(e -> {
            String stringNumber = inputField.getText();
            stringNumber += "6";
            inputField.setText(stringNumber);
        });

        myButton7.addActionListener(e -> {
            String stringNumber = inputField.getText();
            stringNumber += "7";
            inputField.setText(stringNumber);
        });

        myButton8.addActionListener(e -> {
            String stringNumber = inputField.getText();
            stringNumber += "8";
            inputField.setText(stringNumber);
        });

        myButton9.addActionListener(e -> {
            String stringNumber = inputField.getText();
            stringNumber += "9";
            inputField.setText(stringNumber);
        });

        myButtonSum.addActionListener(e -> {
            String stringNumber = inputField.getText();
            stringNumber += "+";
            inputField.setText(stringNumber);
        });

        myButtonSub.addActionListener(e -> {
            String stringNumber = inputField.getText();
            stringNumber += "-";
            inputField.setText(stringNumber);
        });

        myButtonMul.addActionListener(e -> {
            String stringNumber = inputField.getText();
            stringNumber += "*";
            inputField.setText(stringNumber);
        });

        myButtonDiv.addActionListener(e -> {
            String stringNumber = inputField.getText();
            stringNumber += "/";
            inputField.setText(stringNumber);
        });

        myButtonPoint.addActionListener(e -> {
            String stringNumber = inputField.getText();
            stringNumber += ".";
            inputField.setText(stringNumber);
        });

        myButtonLB.addActionListener(e -> {
            String stringNumber = inputField.getText();
            stringNumber += "(";
            inputField.setText(stringNumber);
        });

        myButtonRB.addActionListener(e -> {
            String stringNumber = inputField.getText();
            stringNumber += ")";
            inputField.setText(stringNumber);
        });

        myButtonDel.addActionListener(e -> {
            String stringNumber = inputField.getText();

            if (stringNumber != null && stringNumber.length() != 0) {
                stringNumber = stringNumber.substring(0, stringNumber.length() - 1);
            }
            inputField.setText(stringNumber);
        });


//        myButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
////                String stringNumber = inputField.getText();
////                stringNumber = getInBrackets(stringNumber);
////
////                //вывод результата
////                String tmpNumber = inBrackets(stringNumber);
////                String result = (tmpNumber.charAt(0) == '#') ? "-" + tmpNumber.substring(1) : tmpNumber;
////                double convertToFullFormat = Double.parseDouble(result);
////                NumberFormat nf = new DecimalFormat("#.#############");
////                printField.setText(nf.format(convertToFullFormat));
//
//            }
//        });
    }
}
