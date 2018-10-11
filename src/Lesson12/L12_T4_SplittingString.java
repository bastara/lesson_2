package Lesson12;

public class L12_T4_SplittingString {
    public static void main(String[] args) {
        String str = "1, 2, 3, 4, 5";

        String[] numbers = str.split(", ");

        int sum = 0;
        for (String count : numbers) {
            sum += Integer.parseInt(count);
        }

        System.out.println("Сумма цифр массива равна: " + sum);
    }
}
