package Test.fibo;

import java.util.Scanner;

public class Fibonachi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.println(fibonachi(i));
        }


    }

    public static int fibonachi(int number) {
        if (number == 1 || number == 2) {
            return 1;
        } else if (number == 0) {
            return 0;
        }
        return fibonachi(number - 1) + fibonachi(number - 2);
    }

}

//    private static int fibonachi(int i) {
//        int rez = 0;
//        if (i == 0) {
//            return 0;
//        } else if (i == 1) {
//            return 1;
//        } else {
//            int f1 = 0;
//            int f2 = 1;
//            for (int j = 2; j <= i; j++) {
//                rez = f1 + f2;
//                f1 = f2;
//                f2 = rez;
//            }
//
//        }
//        return rez;
//    }


