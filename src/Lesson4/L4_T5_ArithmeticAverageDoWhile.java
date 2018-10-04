package Lesson4;

import java.util.Scanner;

public class L4_T5_ArithmeticAverageDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите начальное значение (>1)");
        int startNumber = scanner.nextInt();
        System.out.println("Введите конечное значение");
        int endNumber = scanner.nextInt();

        int i = startNumber;
        int sum = startNumber;
        do {
            ++i;
            sum += i;
        } while (i < endNumber);
        double arithmeticAverage = (double) sum / (endNumber - startNumber + 1);
        System.out.println("Среднее арифметическое равно " + arithmeticAverage);

        i = startNumber;
        sum = 0;
        int countParity = 0;
        do {
            if (i % 2 == 0) {
                sum += i;
                countParity++;
            }
            ++i;
        } while (i <= endNumber);
        arithmeticAverage = (double) sum / countParity;
        System.out.println("Среднее арифметическое четных чисел равно " + arithmeticAverage);
    }
}
