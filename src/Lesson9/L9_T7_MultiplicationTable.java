package Lesson9;

import java.util.Scanner;

public class L9_T7_MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер таблицы ");
        int size = scanner.nextInt();
        System.out.println();


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

        int[][] multiplicationTable = getMultiplicationTable(size);

        for (int i = 1; i <= multiplicationTable.length; i++) {
            System.out.printf("%4d|", i);
            for (int j = 1; j <= multiplicationTable[i].length; j++) {
                System.out.printf("%4d", multiplicationTable[i - 1][j - 1]);
            }
            System.out.println();
        }
    }

    private static int[][] getMultiplicationTable(int sizeTable) {
        int[][] multiplicationTable = new int[sizeTable][sizeTable];
        for (int i = 1; i <= sizeTable; i++) {
            for (int j = 1; j <= sizeTable; j++) {
                multiplicationTable[i - 1][j - 1] = i * j;
            }
        }
        return multiplicationTable;
    }
}
