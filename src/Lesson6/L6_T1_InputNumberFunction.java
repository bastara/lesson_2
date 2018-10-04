package Lesson6;

import java.util.Scanner;

public class L6_T1_InputNumberFunction {
    public static void main(String[] args) {
        printReadConsoleFunction("Введидите 1 число ");
        printReadConsoleFunction("Введидите 2 число ");
        printReadConsoleFunction("Введидите 3 число ");
    }

    public static int printReadConsoleFunction(String number) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(number);//не знал что строка будет переводится, а то что 2ной перевод не заметил.
        return scanner.nextInt();
    }
}
