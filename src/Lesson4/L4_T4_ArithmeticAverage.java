package Lesson4;

import java.util.Scanner;

public class L4_T4_ArithmeticAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите начальное значение (>1)");
        int startNumber = scanner.nextInt();
        System.out.println("Введите конечное значение");
        int endNumber = scanner.nextInt();

        //среднее арифметическое
        int sum = 0;//почему данная переменная подчеркивается? Давно заметил, иногда переменные подчеркиваются иногда нет...?
        for (int i = startNumber; i <= endNumber; i++) {
            sum += i;
        }
        double arithmeticAverage = (double) sum / (endNumber - startNumber + 1);
        System.out.println("Среднее арифметическое равно " + arithmeticAverage);

        //среднее арифметическое четных чисел
        int countParity = 0;
        sum = 0;
        for (int i = startNumber; i <= endNumber; i++) {
            if (i % 2 == 0) {
                sum += i;
                countParity++;
            }
        }
        arithmeticAverage = (double) sum / countParity;
        System.out.println("Среднее арифметическое четных чисел равно " + arithmeticAverage);
    }
}
