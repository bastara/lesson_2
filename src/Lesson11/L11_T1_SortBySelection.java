package Lesson11;

public class L11_T1_SortBySelection {
    public static void main(String[] args) {
        int[] array = new int[]{36, 5, 7, 3, 1, 5, 7, 453, 3, 2, 4, 6, 8, 4, 3};

        System.out.println("Отсортированный массив:");
        getSortArray(array);
        for (int element : array) {
            System.out.println(element);
        }
    }

    public static void getSortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int indexMinElement = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[indexMinElement] > array[j]) {
                    indexMinElement = j;
                }
            }
            int tmpElement = array[i];
            array[i] = array[indexMinElement];
            array[indexMinElement] = tmpElement;
        }
    }
}
