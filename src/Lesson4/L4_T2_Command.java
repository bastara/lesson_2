package Lesson4;

import java.util.Scanner;

public class L4_T2_Command {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите команду");
        String command = scanner.nextLine();

        switch (command) {
            case "print":
                System.out.println("Ввведите еще строку");
                System.out.println(scanner.nextLine());
                break;
            case "sum":
                System.out.println("Введите 2 вещественных числа");
                System.out.println("Сумма этих чисел " + (scanner.nextDouble() + scanner.nextDouble()));
                break;
            default:
                System.out.println("Неизвестная команда");
        }
    }
}
