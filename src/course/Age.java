package course;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите возраст");
        int age = scanner.nextInt();

        //проверка возраста
        if (age < 1) {
            System.out.println("Вы слишком малы");
            return;
        } else if (age > 1112) {
            System.out.println("Вы слишком стары");
            return;
        }

        //поиск склонения
        if (age % 100 >= 10 && age % 100 <= 19) {
            System.out.println("Вам " + age + " лет");
        } else if (age % 10 > 1 && age % 10 < 5) {
            System.out.println("Вам " + age + " года");
        } else if (age % 10 == 1) {
            System.out.println("Вам " + age + " год");
        } else {
            System.out.println("Вам " + age + " лет");
        }
    }
}
