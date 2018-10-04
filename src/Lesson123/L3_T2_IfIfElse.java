package Lesson123;

import java.util.Scanner;

public class L3_T2_IfIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Это число положительное");
        } else if (number < 0) {
            System.out.println("Это число отрицательное");
        } else {
            System.out.println("Это число 0");
        }
    }
}
