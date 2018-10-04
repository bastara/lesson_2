package course;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите координату x1 1го треугольника");
        double x1 = scanner.nextInt();
        System.out.println("Введите координату y1 1го треугольника");
        double y1 = scanner.nextInt();
        System.out.println("Введите координату x2 2го треугольника");
        double x2 = scanner.nextInt();
        System.out.println("Введите координату y2 2го треугольника");
        double y2 = scanner.nextInt();
        System.out.println("Введите координату x3 3го треугольника");
        double x3 = scanner.nextInt();
        System.out.println("Введите координату y3 3го треугольника");
        double y3 = scanner.nextInt();

        //ищем уравнение прямой
        double a = y1 - y2;
        double b = x2 - x1;
        double c = x1 * y2 - x2 * y1;

        //проверяем 3ю точку на принадлежность прямой
        double epsilon = 1.0e-10;
        if (Math.abs(a * x3 + b * y3 + c) <= epsilon) {
            System.out.println("Это не треугольник, это прямая");
            return;
        }

        //считаем площадь треугльника
        double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double length2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double length3 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
        double halfPerimeter = (length1 + length2 + length3) / 2;
        double square = Math.sqrt(halfPerimeter * (halfPerimeter - length1) * (halfPerimeter - length2) * (halfPerimeter - length3));
        System.out.println("Площадь треугольника равна " + square);
    }
}
