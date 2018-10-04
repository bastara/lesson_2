package Lesson4;

import java.util.Scanner;

public class L4_T7_DigitOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число");
        int digit = scanner.nextInt();

        int sum = 0;
        int amountNotParity = 0;
        int maxDigit = 0;
        do {
            int lastDigit = digit % 10;
            if (lastDigit > maxDigit) {
                maxDigit = lastDigit;
            }
            if (lastDigit % 2 != 0) {
                amountNotParity += +lastDigit;
            }
            sum += lastDigit;
            digit = digit / 10;
        } while (digit >= 1);
        System.out.println("Сумма цифр равна " + sum);
        System.out.println("Сумма не четных цифр равна " + amountNotParity);
        System.out.println("Максимальная цифра равна " + maxDigit);
    }
}
