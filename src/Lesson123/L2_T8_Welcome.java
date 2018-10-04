package Lesson123;

import java.util.Scanner;

public class L2_T8_Welcome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String name = scanner.nextLine();
        System.out.println("Привет, " + name + "!");
    }
}
