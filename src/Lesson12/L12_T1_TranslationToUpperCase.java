package Lesson12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class L12_T1_TranslationToUpperCase {
    public static void main(String[] args) throws FileNotFoundException {
        try (PrintWriter writer = new PrintWriter("output.txt");
             Scanner scanner = new Scanner(new FileInputStream("lesson12.txt"))) {
            int count = 0;

            String[] str = new String[25];
            for (int i = 0; scanner.hasNext(); ++i) {
                str[i] = scanner.nextLine();
                ++count;

            }

            convertToUpperCase(str, count);

            for (int i = 0; i < count; i++) {
                writer.println(str[i]);
            }
        }
    }

    public static void convertToUpperCase(String[] array, int count) {
        for (int i = 0; i < count; i++) {
            array[i] = array[i].toUpperCase();
        }
    }
}
