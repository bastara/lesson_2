package ru.cft.focusstart.kolobov.Model;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.regex.Pattern;


public class Calculator {
    public String getInBrackets(String stringNumber) throws NullOperationsMyException, BracketsMyException {

        //проверка на недопустимые символы
        if (!Pattern.matches("[0-9\\+\\-\\*\\/\\(\\)\\.]*", stringNumber)) {
            return "неверные символы в выражении";
        }

        //проверяем количество скобок и наличие всех знаков операций
        // ищем унарный минус(ы)
        int countBrackets = 0;
        char[] chArray = stringNumber.toCharArray();
        for (int i = 0; i < stringNumber.length(); i++) {
            if (stringNumber.charAt(i) == '(') {
                countBrackets++;
            }
            if (stringNumber.charAt(i) == ')') {
                countBrackets--;
            }
            if (stringNumber.charAt(i) == '(' && i != 0 && (Character.isDigit(stringNumber.charAt(i - 1)) || stringNumber.charAt(i - 1) == ')')) {
                throw new NullOperationsMyException("Отсутствует знак операции");
            }
            if (stringNumber.charAt(i) == '-' && i == 0) {
                chArray[0] = '@';
            }
            if (stringNumber.charAt(i) == '(' && stringNumber.charAt(i + 1) == '-') {
                chArray[i + 1] = '@';
            }
        }
        if (countBrackets != 0) {
            throw new BracketsMyException("Не верное количество скобок");
        }

        stringNumber = String.copyValueOf(chArray);

        //определяем положение скобок если они есть
        int countOpenBracket = 0;
        int countCloseBracket;

        while (stringNumber.contains(")")) {//ищем позиции скобок
            countCloseBracket = stringNumber.indexOf(")");
            for (int i = countCloseBracket; i >= 0; i--) {
                if (stringNumber.charAt(i) == '(') {
                    countOpenBracket = i;
                    break;
                }
            }

            String tmpString;
            String brackets = stringNumber.substring(countOpenBracket + 1, countCloseBracket);
            int lengthArray = stringNumber.length();
            if (countOpenBracket > 0) {
                tmpString = stringNumber.substring(0, countOpenBracket) + inBracketsOperations(brackets);
                if (countCloseBracket != lengthArray) {
                    stringNumber = tmpString + stringNumber.substring(countCloseBracket + 1);
                }
            } else {
                tmpString = inBracketsOperations(brackets);
                stringNumber = (countCloseBracket != lengthArray) ? tmpString + stringNumber.substring(countCloseBracket + 1) :
                        tmpString;
            }
        }
        //результат в скобках
        String tmpNumber = inBracketsOperations(stringNumber);

        //результат <>0
        String result = (tmpNumber.charAt(0) == '@') ? "-" + tmpNumber.substring(1) : tmpNumber;

        //преобразование к виду
        double convertToFullFormat = Double.parseDouble(result);
        NumberFormat nf = new DecimalFormat("#.#############");

        return nf.format(convertToFullFormat);
    }

    private String inBracketsOperations(String str) {
        String expression = str;

        //создаем массив чисел
        String inBracketsArr[] = expression.split("[-/*+]");
        double numArr[] = new double[inBracketsArr.length];
        for (int i = 0; i < inBracketsArr.length; i++) {
            if (inBracketsArr[i].contains("@")) {
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
            if (expression.charAt(i) == '*') {
                singArr[count] = '*';
                ++count;
            }
            if (expression.charAt(i) == '/') {
                singArr[count] = '/';
                ++count;
            }
            if (expression.charAt(i) == '+') {
                singArr[count] = '+';
                ++count;
            }
            if (expression.charAt(i) == '-') {
                singArr[count] = '-';
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
                if (numArr[countSing + 1] == 0) {
                    throw new ArithmeticException("Деление на ноль");
                }
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
                    singArr[k - 1] = singArr[k];
                    numArr[k] = numArr[k + 1];
                }
                --count;
            } else if (singArr[countSing] == '-') {
                numArr[countSing] = numArr[countSing] - numArr[countSing + 1];
                for (int k = countSing + 1; k < count; k++) {
                    singArr[k - 1] = singArr[k];
                    numArr[k] = numArr[k + 1];
                }
                --count;
            } else {
                countSing++;
            }
        } while (countSing < count);

        expression = (numArr[0] < 0) ? '@' + Double.toString(numArr[0] * (-1)) : Double.toString(numArr[0]);
        return expression;
    }
}
