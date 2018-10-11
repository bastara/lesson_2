package Lesson12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class L12_T3_NumberOfRecord {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream("lesson12.txt"))) {
            StringBuilder str = new StringBuilder();
            while (scanner.hasNext()) {
                str.append(scanner.nextLine().toLowerCase());
            }

            String pattern = "la";
            int count = getRecordCount(str.toString(), pattern);

            System.out.println("Строка: \"" + pattern + "\" в тексте встречается " + count + " раз");
        }
    }

    private static int getRecordCount(String str, String pattern) {
        int countSymbol = 0;
        int pos = 0;
        for (; ; ) {
            pos = str.indexOf(pattern.toLowerCase(), pos);
            if (pos >= 0) {
                countSymbol++;
                pos = pos + pattern.length();
            } else {
                break;
            }
        }
        return countSymbol;
    }

}