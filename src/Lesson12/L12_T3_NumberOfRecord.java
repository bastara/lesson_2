package Lesson12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class L12_T3_NumberOfRecord {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream("lesson12.txt"))) {

            StringBuilder str = new StringBuilder();
            while (scanner.hasNext()) {
                str.append(scanner.nextLine()).append("\n");
            }

            String data = str.toString();
            String pattern = "la";
            int countSymbol = 0;
            int pos = 0;
            for (; ; ) {
                pos = data.indexOf(pattern, pos);
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
}