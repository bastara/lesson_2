package Lesson12;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class L12_T1_TranslationToUpperCaseVar2 {
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter("output.txt");
             Scanner scanner = new Scanner(new FileInputStream("lesson12.txt"))) {

            while (scanner.hasNext()) {
                writer.println(scanner.nextLine().toUpperCase());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
