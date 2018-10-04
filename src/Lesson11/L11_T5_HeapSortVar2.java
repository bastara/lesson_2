package Lesson11;

public class L11_T5_HeapSortVar2 {
    public static void main(String[] args) {
//        int[] array = new int[]{36, 5, 7, 3, 1, 5, 7, 453, 3, 2, 4, 6, 8, 4, 3};
        int[] array = new int[]{10, 2, 3, 6, 8, 7, 1, 12};
        getHeapSort(array);
        System.out.println("Отсортированный массив:");
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void getHeapSort(int[] a) {
        int index1 = a.length / 2 - 1;
        for (int i = index1; i >= 0; i--) {
            int indexChildren = i;
            while (indexChildren * 2 + 1 <= a.length - 1) {
                if (indexChildren * 2 + 2 <= a.length - 1) {
                    if (a[indexChildren * 2 + 1] >= a[indexChildren * 2 + 2]) {
                        if (a[indexChildren] < a[indexChildren * 2 + 1]) {
                            int tmp = a[indexChildren];
                            a[indexChildren] = a[indexChildren * 2 + 1];
                            a[indexChildren * 2 + 1] = tmp;
                            indexChildren = indexChildren * 2 + 1;
                            continue;
                        }
                    } else if (a[indexChildren] < a[indexChildren * 2 + 2]) {
                        int tmp = a[indexChildren];
                        a[indexChildren] = a[indexChildren * 2 + 2];
                        a[indexChildren * 2 + 2] = tmp;
                        indexChildren = indexChildren * 2 + 2;
                        continue;
                    }
                }
                if (a[indexChildren] < a[indexChildren * 2 + 1]) {
                    int tmp = a[indexChildren];
                    a[indexChildren] = a[indexChildren * 2 + 1];
                    a[indexChildren * 2 + 1] = tmp;
                }
                break;
            }
        }
        for (int i = 0; i < a.length - 1; i++) {
            int tmp = a[a.length - 1 - i];
            a[a.length - 1 - i] = a[0];
            a[0] = tmp;

            int indexChildren = 0;
            while (indexChildren * 2 + 1 < a.length - 1 - i) {
                if (indexChildren * 2 + 2 < a.length - 1 - i) {
                    if (a[indexChildren * 2 + 1] >= a[indexChildren * 2 + 2]) {
                        if (a[indexChildren] < a[indexChildren * 2 + 1]) {
                            tmp = a[indexChildren];
                            a[indexChildren] = a[indexChildren * 2 + 1];
                            a[indexChildren * 2 + 1] = tmp;
                            indexChildren = indexChildren * 2 + 1;
                            continue;
                        }
                    } else if (a[indexChildren] < a[indexChildren * 2 + 2]) {
                        tmp = a[indexChildren];
                        a[indexChildren] = a[indexChildren * 2 + 2];
                        a[indexChildren * 2 + 2] = tmp;
                        indexChildren = indexChildren * 2 + 2;
                        continue;
                    }
                }
                if (a[indexChildren] < a[indexChildren * 2 + 1]) {
                    tmp = a[indexChildren];
                    a[indexChildren] = a[indexChildren * 2 + 1];
                    a[indexChildren * 2 + 1] = tmp;
                }
                break;
            }
        }
    }
}

