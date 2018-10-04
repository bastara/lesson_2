package Lesson4;

import java.util.Scanner;

public class L4_T4_NextDate2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите день");
        int day = scanner.nextInt();
        System.out.println("Введите месяц");
        int month = scanner.nextInt();
        System.out.println("Введите год");
        int year = scanner.nextInt();
        System.out.printf("Вы ввели %02d.%02d.%d", day, month, year);
        System.out.println();

        int[] dayMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            dayMonth[1] = 29;
        }

        if ((month < 1 || month > 12) || (day < 1 || day > dayMonth[month - 1])) {
            System.out.println("Это не корректная дата");
            return;
        }

        if (day + 1 < dayMonth[month - 1]) {
            System.out.printf("Следующая дата %02d.%02d.%d", day + 1, month, year);
            return;
        }

        if (month < 12) {
            System.out.printf("Следующая дата 01.%02d.%d", month + 1, year);
        } else {
            System.out.printf("Следующая дата 01.01.%d", year + 1);
        }
    }
}
