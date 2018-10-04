package Lesson123;

import java.util.Scanner;

public class L3_T3_MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1 число");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите 2 число");
        int secondNumber = scanner.nextInt();

        //проверка ifelse
        System.out.println("Проверка оператором ifesle");
        if (firstNumber > secondNumber) {
            System.out.printf("Наибольшеe число %d, наименьшее число %d", firstNumber, secondNumber);
        } else if (firstNumber < secondNumber) {
            System.out.printf("Наибольшеe число %d, наименьшее число %d", secondNumber, firstNumber);
        } else {
            System.out.println("Эти числа равны");
        }

        //проверка тернарным оператором
        int min = (firstNumber > secondNumber) ? secondNumber : firstNumber;
        int max = (firstNumber > secondNumber) ? firstNumber : secondNumber;
        System.out.println();
        System.out.println();
        System.out.println("Проверка тернарным оператором");
        if (firstNumber == secondNumber) {
            System.out.println("Данные числа равны");
        } else {
            System.out.printf("Наибольшеe число %d, наименьшее число %d", max, min);
        }
    }
}
