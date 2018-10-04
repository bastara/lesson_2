package Lesson4;

import java.util.Scanner;

public class L4_Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nFibonacci;
        System.out.println("Введите номер числа Фибоначи от 0 до 400000000");
        do {
            nFibonacci = scanner.nextInt();
        } while (nFibonacci < 0 || nFibonacci > 400000000);//при больших значения будет переполнение типа
        //т.к. в условиях задачи этого не было и double нельзя использовать то оставил как есть,
        //предпологая, что в этой задаче отрабатываются другие навыки.

        int fibonacci0 = 0; //или можно сократить fibo1? но тут подчеркивает...значит не надо?
        int fibonacci1 = 1;
        if (nFibonacci == 0) {
            System.out.println("0 член ряда Фибоначи равен 0");
        } else if (nFibonacci == 1) {
            System.out.println("1 член ряда Фибоначи равен 1");
        } else {
            for (int i = 2; i <= nFibonacci; i++) {
                int fibonacci2 = fibonacci1 + fibonacci0;
                fibonacci0 = fibonacci1;
                fibonacci1 = fibonacci2;
            }
            System.out.println(nFibonacci + " член ряда Фибоначи равен " + fibonacci1);
        }
    }
}
