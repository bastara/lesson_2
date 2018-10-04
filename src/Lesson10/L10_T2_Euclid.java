package Lesson10;

import java.util.Scanner;

public class L10_T2_Euclid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите 1 число ");
        int number1 = scanner.nextInt();
        System.out.print("Введите 2 число ");
        int number2 = scanner.nextInt();

        int nod = nodEuclid(number1, number2);
        System.out.print(nod != -1 ? "Наибольший общий делитель равен " + nod : "Наибольшего общего делителя нет");
    }

    public static int nodEuclid(int number1, int number2) {
        if (number1 == 0 && number2 == 0) {
            return (-1);
        }

        if (number1 == 0) {
            return number2;
        }
        if (number2 == 0) {
            return number1;
        }


        if (number1 % number2 == 0) {
            return number2;
        }
        return nodEuclid(number2, number1 % number2);
    }
}
