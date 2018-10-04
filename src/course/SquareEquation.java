package course;

import java.util.Scanner;

public class SquareEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Квадратное уравнение");
        System.out.println("Введите a");
        double a = scanner.nextDouble();
        System.out.println("Введите b");
        double b = scanner.nextDouble();
        System.out.println("Введите c");
        double c = scanner.nextDouble();

        //проверка коэффициентов на 0
        double epsilon = 1.0e-10;
        if (Math.abs(a) < epsilon && Math.abs(b) < epsilon && Math.abs(c) < epsilon) {
            System.out.println("Бесконечное количество решений");
            return;
        }

        if (Math.abs(a) < epsilon && Math.abs(b) < epsilon && Math.abs(c) >= epsilon) {
            System.out.println("Данное уравнение не квадратное. Корней нет.");
            return;
        }

        if (Math.abs(a) < epsilon) {
            System.out.println("Данное уравнение не квадратное. Корень равен " + (-c) / b);
            return;
        }

        //вычисление дискриминанта
        double discriminant = b * b - 4 * a * c;
        double x1;
        double x2;
        if (discriminant >= epsilon) {
            x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Корни уравнения " + x1 + " и " + x2);
        } else if (Math.abs(discriminant) < epsilon) {
            x1 = -b / (2 * a);
            System.out.println("Корень равен " + x1);
        } else {
            System.out.println("Корней нет");
        }
    }
}
