package Lesson4;

import java.util.Scanner;

public class L4_T6_TenNumber {
    public static void main(String[] args) {
        int count = 1;
        do {
            System.out.printf("%d\t", count);
            if (count % 10 == 0) {
                System.out.println();
            }
            ++count;
        } while (count <= 100);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите Х");
        int x = scanner.nextInt();
        System.out.println("Введите Y");
        int y = scanner.nextInt();
        System.out.println("Введите N");
        int n = scanner.nextInt();

        count = x;
        do {
            System.out.printf("%d\t", count);
            if ((count + 1 - x) % n == 0) {
                System.out.println();
            }
            ++count;
        } while (count <= y);
    }
}
