package Lesson4;

import java.util.Scanner;

public class L4_T1_EqualNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 1е число");
        double number1 = scanner.nextDouble();
        System.out.println("Введите 2е число");
        double number2 = scanner.nextDouble();

        double epsilon = 1.0e-10;
        if (Math.abs(number1 - number2) <= epsilon) {
            System.out.println("Введенные числа равны");
        } else {
            System.out.println("Введенные числа не равны");
        }
    }
}
