package Lesson11;

public class L11_T4_QuickSort {
    public static void main(String[] args) {
//        int[] array = new int[]{36, 3, 1, 5, 7, 453, 3, 8, 4, 3};
        int[] array = new int[]{36, 3, 9, 5, 7, 15, 3, 8, 4, 1};
        quickSort(array, 0, array.length - 1);
        System.out.println("Отсортированный массив:");
        for (int element : array) {
            System.out.println(element);
        }
    }

    public static void quickSort(int[] a, int left, int right) {
        if (left == right) {
            return;
        }
        if (right - left == 1) {
            if (a[left] > a[right]) {
                int tmp = a[right];
                a[right] = a[left];
                a[left] = tmp;
            }
            return;
        }
        int support = a[left];
        int i = left;
        int j = right;

        while (i <= j) {
            while (support > a[i]) {
                i++;
//                if (countLeft > countRight) {
//                    break;
//                }
            }
            while (support < a[j]) {
                j--;
//                if (countRight < countLeft) {
//                    break;
//                }
            }
            if (i <= j) {
                int tmp = a[j];
                a[j] = a[i];
                a[i] = tmp;
                i++;
                j--;
            }
        }
        if (i < right) {
            quickSort(a, i, right);
        }
        if (j > left) {
            quickSort(a, left, j);
        }
    }
}

