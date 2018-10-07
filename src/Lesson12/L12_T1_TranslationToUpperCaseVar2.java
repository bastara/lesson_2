package Lesson12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class L12_T1_TranslationToUpperCaseVar2 {
    public static void main(String[] args) throws FileNotFoundException {
        try (PrintWriter writer = new PrintWriter("output.txt");
             Scanner scanner = new Scanner(new FileInputStream("lesson12.txt"))) {

            String str = "";
            while (scanner.hasNext()) {
                str += scanner.nextLine() + "\r\n";
            }

            writer.println(convertToUpperCase(str));
        }
    }

    public static String convertToUpperCase(String str) {
        return str.toUpperCase();

    }
}
