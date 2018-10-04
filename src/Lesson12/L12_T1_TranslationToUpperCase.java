package Lesson12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class L12_T1_TranslationToUpperCase {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream("lesson12.txt"))) {
            int count = 0;
            while (scanner.hasNextLine()) {
                String s = scanner.nextLine();
                ++count;
            }
            String[] str = new String[count];
            for (int i = 0; i < count; ++i) {
                str[i] = scanner.nextLine();

            }
            System.out.println(str[15]);
        }
    }
}
