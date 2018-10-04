package Lesson11;

public class L11_T3_InsertionSort {
    public static void main(String[] args) {
        int[] array = new int[]{36, 5, 7, 3, 1, 5, 7, 453, 3, 2, 4, 6, 8, 4, 3};

        System.out.println("Отсортированный массив:");
        for (int i : getSortArray(array)) {
            System.out.println(i);
        }
    }

    public static int[] getSortArray(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            for (int j = i - 1; j >= -1; j--) {
                if (j < 0 || tmp >= array[j]) {
                    array[j + 1] = tmp;
                    break;
                } else {
                    array[j + 1] = array[j];
                }
            }
        }
        return array;
    }
}
