package Lesson8;

import java.util.Scanner;

public class L8_T3_CountSymbol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку");
        String str = scanner.nextLine();

        int lettersCount = 0;
        int digitsCount = 0;
        int gapsCount = 0;
        int symbolsCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                lettersCount++;
            } else if (Character.isDigit(str.charAt(i))) {
                digitsCount++;
            } else if (Character.isWhitespace(str.charAt(i))) {
                gapsCount++;
            } else {
                symbolsCount++;
            }
        }
        System.out.printf("В этой строке %d букв, %d цифр, %d пробелов и %d остальных символов", lettersCount, digitsCount, gapsCount, symbolsCount);
    }
}
