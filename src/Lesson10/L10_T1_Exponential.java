package Lesson10;

import java.util.Scanner;

public class L10_T1_Exponential {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число ");
        int number = scanner.nextInt();
        System.out.print("Введите степень для этого числа ");
        int exponent = scanner.nextInt();
        System.out.println();

        long startTime = System.nanoTime();
        System.out.println("Возведение в степень рекурсивной функцией");
        System.out.printf("Число %d в степень %d равно %d", number, exponent, exponential(number, exponent));
        long finishTime = System.nanoTime();
        System.out.println();
        System.out.println("Время вычисления степени " + (finishTime - startTime) + " ns");
        System.out.println();

        startTime = System.nanoTime();
        System.out.println("Возведение в степень не рекурсивной функцией");
        System.out.printf("Число %d в степень %d равно %d", number, exponent, exponentialCycle(number, exponent));
        finishTime = System.nanoTime();
        System.out.println();
        System.out.println("Время вычисления степени " + (finishTime - startTime) + " ns");
    }

    public static int exponential(int number, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return exponential(number, exponent - 1) * number;
    }

    public static int exponentialCycle(int number, int exponent) {
        int result = number;
        if (exponent == 0) {
            return 1;
        } else {
            for (int i = 1; i < exponent; i++) {
                result *= number;
            }
        }
        return result;
    }
}
