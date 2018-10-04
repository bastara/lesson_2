package Lesson11;

public class L11_T5_HeapSort {
    public static void main(String[] args) {
        int[] array = new int[]{36, 5, 7, 3, 1, 5, 7, 453, 3, 2, 4, 6, 8, 4, 3};

        getHeapSort(array);
        System.out.println("Отсортированный массив:");
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void getHeapSort(int[] a) {
        int index1 = a.length / 2 - 1;
        for (int i = index1; i >= 0; i--) {
            checkChangeChildren(a, i, 0);
        }
        for (int i = 0; i < a.length - 1; i++) {
            int tmp = a[a.length - 1 - i];
            a[a.length - 1 - i] = a[0];
            a[0] = tmp;
            checkChangeChildren(a, 0, i + 1);
        }
    }

    public static void checkChangeChildren(int[] a, int i, int l) {
        if (i * 2 + 1 <= a.length - 1 - l) {
            if (i * 2 + 2 <= a.length - 1 - l) {
                if (a[i * 2 + 1] >= a[i * 2 + 2]) {
                    if (a[i] < a[i * 2 + 1]) {
                        int tmp = a[i];
                        a[i] = a[i * 2 + 1];
                        a[i * 2 + 1] = tmp;
                        checkChangeChildren(a, i * 2 + 1, l);
                        return;
                    }
                } else if (a[i] < a[i * 2 + 2]) {
                    int tmp = a[i];
                    a[i] = a[i * 2 + 2];
                    a[i * 2 + 2] = tmp;
                    checkChangeChildren(a, i * 2 + 2, l);
                    return;
                }
            }
            if (a[i] < a[i * 2 + 1]) {
                int tmp = a[i];
                a[i] = a[i * 2 + 1];
                a[i * 2 + 1] = tmp;
                checkChangeChildren(a, i * 2 + 1, l);
            }
        }
    }
}

