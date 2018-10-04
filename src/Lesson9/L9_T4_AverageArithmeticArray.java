package Lesson9;

public class L9_T4_AverageArithmeticArray {
    public static void main(String[] args) {
        int[] array = {3, 6, 8, 3, 5, 12, 54, 234, 58, 333, 34, 8};

        System.out.println("Среднее арифметическое четных чисел массива равно " + getAverageArithmeticParity(array));
    }

    public static double getAverageArithmeticParity(int[] array) {
        int sum = 0;
        int countParity = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                sum += i;
                countParity++;
            }
        }
        return (double) sum / countParity;
    }
}
