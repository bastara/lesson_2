package Lesson12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class L12_T3_NumberOfRecord {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream("lesson12.txt"))) {

            String str = "";
            while (scanner.hasNext()) {
                str += scanner.nextLine() + "\r\n";
            }

            str = convertToLowerCase(str);

            String pattern = "la";

            int countSymbol = 0;
            int pos = 0;
            for (; ; ) {
                pos = str.indexOf(pattern, pos);
                if (pos >= 0) {
                    countSymbol++;
                    pos++;
                } else {
                    break;
                }
            }

            System.out.println("Строка: \"" + pattern + "\" в тексте встречается " + countSymbol + " раз");
        }
    }

    private static String convertToLowerCase(String str) {
        return str.toLowerCase();
    }
}