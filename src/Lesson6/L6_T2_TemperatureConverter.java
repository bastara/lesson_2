package Lesson6;

import java.util.Scanner;

public class L6_T2_TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите температуру в градусах Цельсия ");
        double degreeCelsius = scanner.nextDouble();
        System.out.println();

        System.out.printf("Эта же температура в градусах Фарингейта равна %.2f", getFahrenheitFromCelsius(degreeCelsius));
        System.out.println();
        System.out.printf("Эта же температура в градусах Кельвина равна %.2f", getKelvinFromCelsius(degreeCelsius));
    }

    public static double getFahrenheitFromCelsius(double degreeCelsius) {
        return degreeCelsius * 9 / 5 + 32;
    }

    public static double getKelvinFromCelsius(double degreeCelsius) {
        return degreeCelsius + 273.15;
    }
}
