package Lesson4;

import java.util.Scanner;

public class L4_T3_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int number2 = scanner.nextInt();
        System.out.println("Введите код команды");
        int comandCode = scanner.nextInt();

        switch (comandCode) {
            case 1:
                System.out.println("Сумма " + (number1 + number2));
                break;
            case 2:
                System.out.println("Разность " + (number1 - number2));
                break;
            case 3:
                System.out.println("Умножение " + (number1 * number2));
                break;
            case 4:
                System.out.println("Деление " + (number1 / number2));
                break;
            default:
                System.out.println("Неизвестная операция");
        }
    }
}
