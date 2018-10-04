package Lesson4;

import java.util.Scanner;

public class L4_T4_ArithmeticAverageOnlyWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите начальное значение (>1)");
        int startNumber = scanner.nextInt();
        System.out.println("Введите конечное значение");
        int endNumber = scanner.nextInt();

        //среднее арифметическое
        int sum = 0;
        int i = startNumber;
        while (i <= endNumber) {
            sum += i;
            ++i;
        }
        double arithmeticAverage = (double) sum / (endNumber - startNumber + 1);
        System.out.println("Среднее арифметическое равно " + arithmeticAverage);

        //среднее арифметическое четных чисел
        sum = 0;
        i = startNumber;
        int countParity = 0;
        while (i <= endNumber) {
            if (i % 2 == 0) {
                sum += i;
                countParity++;
            }
            ++i;
        }
        arithmeticAverage = (double) sum / countParity;
        System.out.println("Среднее арифметическое четных чисел равно " + arithmeticAverage);
    }
}
