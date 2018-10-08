package Lesson12;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class L12_T1_TranslationToUpperCaseVar2 {
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter("output.txt");
             Scanner scanner = new Scanner(new FileInputStream("lesson12.txt"))) {

            StringBuilder sb = new StringBuilder();
            while (scanner.hasNext()) {
                sb.append(scanner.nextLine()).append("\n");
            }

            writer.println(convertToUpperCase(sb.toString()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String convertToUpperCase(String str) {
        return str.toUpperCase();
    }
}
