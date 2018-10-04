package Lesson5;

import java.util.Scanner;

public class L5_T1_Break {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String hiddenLine = "qwerty";

        for (; ; ) {
            System.out.println("Введите строку");
            String stringUser = scanner.nextLine();

            if (hiddenLine.equals(stringUser)) {
                System.out.println("Верная строка");
                break;
            } else {
                System.out.println("Неверная строка");
            }
        }
    }
}
