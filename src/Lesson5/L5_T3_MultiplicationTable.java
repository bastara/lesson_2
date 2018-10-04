package Lesson5;

import java.util.Scanner;

public class L5_T3_MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер таблицы ");
        int size = scanner.nextInt();

        System.out.print("    |");
        for (int i = 1; i <= size; i++) {
            System.out.printf("%4d", i);
        }

        System.out.println();
        System.out.print("____|");
        for (int j = 0; j < size; j++) {
            System.out.print("____");
        }
        System.out.println();

        for (int i = 1; i <= size; i++) {
            System.out.printf("%4d|", i);
            for (int j = 1; j <= size; j++) {
                System.out.printf("%4d", (i * j));
            }
            System.out.println();
        }
    }
}
