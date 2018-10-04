package Lesson9;

public class L9_T2_SearchElement {
    public static void main(String[] args) {
        double[] array = {3, 6, 8, 3, 5, 12, 54, 234, 58, 333, 0.34, 34, 6};
        double pattern = 0.134;
        System.out.println("Поиск элемента " + getPatternIndex(pattern, array));
    }

    private static int getPatternIndex(double pattern, double[] array) {
        double epsilon = 1.0e-10;

        for (int i = 0; i < array.length; i++) {
            if (Math.abs(pattern - array[i]) <= epsilon) {
                return i;
            }
        }
        return -1;
    }
}
