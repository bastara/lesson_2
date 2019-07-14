package explore;

public class Orel {
    public static void main(String args[]) {
        int countEven = 0;
        int countOdd = 0;

        int a = 0; // Начальное значение диапазона - "от"
        int b = 10; // Конечное значение диапазона - "до"

        for (int i = 0; i < 1000000; i++) {
            int random_number1 = a + (int) (Math.random() * b);
//            System.out.println(random_number1);
            if (random_number1 < 5) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println("четное-" + countEven);
        System.out.println("нечетное-" + countOdd);
    }

}
