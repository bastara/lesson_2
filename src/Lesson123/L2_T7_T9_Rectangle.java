package Lesson123;

import java.util.Scanner;

public class L2_T7_T9_Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину прямогольника ");
        double length = scanner.nextDouble();
        System.out.println("Введите ширину прямогольника ");
        double height = scanner.nextDouble();

        double square = length * height;
        System.out.println("Площадь прямоугольника равна " + square);

        double perimeter = (length + height) * 2;
        System.out.println("Периметр прямоуголника равен " + perimeter);

        System.out.println("Используем printf");
        System.out.printf("Длина=%.2f, высота=%.2f, площадь=%.2f, периметр=%.2f", length, height, square, perimeter);
    }
}
