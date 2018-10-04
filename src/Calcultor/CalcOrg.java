package Calcultor;

public class CalcOrg {
    private static String inBrackets(String a) {

        String expression = a;

        String inBracketsArr[] = expression.split("[-/*+]");//разбираем строку на числа с учетом знака.
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

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите выражение");
//            String stringNumber = scanner.nextLine();//проверку на буквы.Удалить все пробелы.

//        String stringNumber = "((34/(-3)+443*23/5)-12/7*3)/(-3)";
        String stringNumber = "-7-6*2+34/(-3-14)+(((56+34)*(-3)-70)*2)+150.6/(-2)";
        System.out.println("вы ввели " + stringNumber);

        //переводим все унарные минусы в #
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
//                if (countBracket2 != lengthArray) {
//                    stringNumber = tmpString + stringNumber.substring(countBracket2 + 1);
//                } else {
//                    stringNumber = tmpString;
//                }
                stringNumber = (countBracket2 != lengthArray) ? tmpString + stringNumber.substring(countBracket2 + 1) :
                        tmpString;
            }
        }

        //вывод результата
        String tmp = inBrackets(stringNumber);
        System.out.println((tmp.charAt(0) == '#') ? "-" + tmp.substring(1) : tmp);
    }
}

