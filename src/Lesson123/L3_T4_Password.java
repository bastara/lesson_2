package Lesson123;

import java.util.Scanner;

public class L3_T4_Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль");
        String checkPassword = scanner.nextLine();
        String password = "pwd";

        if (password.equals(checkPassword)) {
            System.out.println("Пароль верный");
        } else if (password.length() < checkPassword.length()) {
            System.out.println("Пароль не верный, строка слишком длинная");
        } else if (password.length() > checkPassword.length()) {
            System.out.println("Пароль не верный, строка слишком короткая");
        } else {
            System.out.println("Пароли неверный");
        }
    }
}
