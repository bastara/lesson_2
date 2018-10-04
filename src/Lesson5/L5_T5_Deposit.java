package Lesson5;

import java.util.Scanner;

public class L5_T5_Deposit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите срок вклада в месяцах ");
        int period = scanner.nextInt();
        System.out.println();
        System.out.print("Введите процентную ставку ");
        double percent = scanner.nextDouble();
        System.out.println();
        System.out.print("Введите сумму вклада ");
        double sum = scanner.nextDouble();

        double profit = 0;
        final int monthInYear = 12;
        final int divisorOfOneHundred = 100;
        for (int i = 0; i < period; i++) {
            profit += (sum + profit) * percent / divisorOfOneHundred / monthInYear;
        }
        System.out.println();
        System.out.printf("Ваша прибыль за %d месяцев составила %.2f. Итого %.2f", period, profit, profit + sum);
    }
}
