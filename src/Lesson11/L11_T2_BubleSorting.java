package Lesson11;

public class L11_T2_BubleSorting {
    public static void main(String[] args) {
        int[] array = new int[]{36, 5, 7, 3, 1, 5, 7, 453, 3, 2, 4, 6, 8, 4, 3};

        System.out.println("Отсортированный массив:");
        for (int element : getSortArray(array)) {
            System.out.println(element);
        }
    }

    public static int[] getSortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean isArraySorted = true;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    isArraySorted = false;
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
            if (isArraySorted) {
                return array;
            }
        }
        return array;
    }
}
