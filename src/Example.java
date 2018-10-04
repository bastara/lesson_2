public class Example {
    public static void main(String[] args) {
        int a = 15;
        int b = 10;
        int c = b / 2;
        int result;
        result = b * c + a * (a / c + b);
        System.out.println("Полученный результат-" + result);
    }
}