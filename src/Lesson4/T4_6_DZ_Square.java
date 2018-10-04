package Lesson4;

public class T4_6_DZ_Square {
    public static void main(String[] args) {
        //Задача на дом «Окружность»
        /* считаем площадь
        круга */
        double radius = 3;
        double square = Math.PI * Math.pow(radius, 2);
        //TODO: нужно уменьшить число знаков поле запятой
        System.out.println("Площадь круга равна (для радиуса 3)-" + square);
        /** считаем
         * длину окружности
         */
        double length = 2 * Math.PI * radius;
        System.out.println("Длина окружности равна (для радиуса 3)-" + length);

        //считаем радиус окружности от площади
        double radiusDisk = Math.sqrt(square / Math.PI);
        System.out.println("Радиус окружности для круга с площадью " + square + " равен " + radiusDisk);

        //считаем площадь сектора
        int angle = 36;
        double squareSector = Math.PI * Math.pow(radius, 2) * angle / 360;
        System.out.println("Площадь сектора с углом 36 градусов и радиусом 3 равна " + squareSector);
    }
}
