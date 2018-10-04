package Lesson5;

import java.util.Scanner;

public class L5_T2_SimpleNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число ");
        int number = scanner.nextInt();

        System.out.println("Простые числа не превышающие " + number);
        for (int i = 2; i <= number; i++) {
            boolean isSimpleNumber = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isSimpleNumber = false;
                    break;
                }
            }
            if (isSimpleNumber) {
                System.out.println(i);
            }
        }
    }
}
