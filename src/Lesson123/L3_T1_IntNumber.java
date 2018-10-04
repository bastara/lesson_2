package Lesson123;

import java.util.Scanner;

public class L3_T1_IntNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();

        if (number >= 0) {//проверка числа +/-
            System.out.println("Это число положительное");
        } else {
            System.out.println("Это число отрицательное");
        }

        if (number % 2 == 0) {//проверка четности
            System.out.println("Это число четное");
        }

        if (number % 5 == 0) {//проверка кратности 5
            System.out.println("Это число кратно 5");
        }
    }
}
