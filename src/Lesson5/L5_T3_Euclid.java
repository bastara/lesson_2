package Lesson5;

import java.util.Scanner;

public class L5_T3_Euclid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите 1 число ");
        int number1 = scanner.nextInt();
        System.out.println();
        System.out.print("Введите 2 число ");
        int number2 = scanner.nextInt();


        if (number1 == 0 && number2 == 0) {
            System.out.println("Наибольшего общего делителя нет");
            return;
        }

        if (number1 == 0) {
            System.out.println("Наибольший общий делитель равен " + number2);
            return;
        }
        if (number2 == 0) {
            System.out.println("Наибольший общий делитель равен " + number1);
            return;
        }

        for (; ; ) {
            if (number1 % number2 == 0) {
                System.out.println("Наибольший общий делитель равен " + number2);
                return;
            } else {
                int tmpNumber = number1;
                number1 = number2;
                number2 = tmpNumber % number2;
            }
        }
    }
}