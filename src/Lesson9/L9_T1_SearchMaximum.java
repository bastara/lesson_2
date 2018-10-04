package Lesson9;

public class L9_T1_SearchMaximum {
    public static void main(String[] args) {
        double[] array = {3, 6, 8, 3, 5, 12, 54, 234, 58, 333, 0.34, 34, 6};

        System.out.print("Максимальный элемент массива " + getMaxElement(array));
    }

    public static double getMaxElement(double[] array) {
        double maxElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if (maxElement < array[i]) {
                maxElement = array[i];
            }
        }
        return maxElement;
    }
}
