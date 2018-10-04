package Lesson11;

public class L11_T4_QuickSort {
    public static void main(String[] args) {
        int[] array = new int[]{36, 3, 1, 5, 7, 453, 3, 8, 4, 3};

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
        int countLeft = left;
        int countRight = right;

        while (countLeft <= countRight) {
            while (support > a[countLeft]) {
                countLeft++;
                if (countLeft > countRight) {
                    break;
                }
            }
            while (support < a[countRight]) {
                countRight--;
                if (countRight < countLeft) {
                    break;
                }
            }
            if (countLeft <= countRight) {
                int tmp = a[countRight];
                a[countRight] = a[countLeft];
                a[countLeft] = tmp;
                countLeft++;
                countRight--;
            }
        }
        if (countLeft < right) {
            quickSort(a, countLeft, right);
        }
        if (countRight > left) {
            quickSort(a, left, countRight);
        }
    }
}

