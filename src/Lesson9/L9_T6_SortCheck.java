package Lesson9;

public class L9_T6_SortCheck {
    public static void main(String[] args) {
        int[] array = {19, 12, 9, 7, 6, 4, 2, -3};

        System.out.println((isSortUP(array) ? "Массив отсортирован по возрастанию" : "Массив не отсортирован по возрастанию"));
        System.out.println((isSortDown(array) ? "Массив отсортирован по убыванию" : "Массив не отсортирован по убыванию"));

    }

    private static boolean isSortUP(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private static boolean isSortDown(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
