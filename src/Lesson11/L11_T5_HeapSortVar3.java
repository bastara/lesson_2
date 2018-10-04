package Lesson11;

public class L11_T5_HeapSortVar3 {
    public static void main(String[] args) {
        int[] array = new int[]{36, 5, 7, 3, 1, 5, 7, 453, 3, 2, 4, 6, 8, 4, 3};

        heapSort(array);
        System.out.println("Отсортированный массив:");
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void heapSort(int[] a) {
        int index1 = a.length / 2 - 1;
        for (int i = index1; i >= 0; i--) {
            checkChildren(a, i, 0);
        }
        for (int i = 0; i < a.length - 1; i++) {
            changeMembers(a, a.length - 1 - i, 0);
            checkChildren(a, 0, i + 1);
        }
    }

    public static void checkChildren(int[] a, int indexChildren, int k) {
        while (indexChildren * 2 + 1 <= a.length - 1 - k) {
            int c1 = indexChildren * 2 + 1;
            int c2 = indexChildren * 2 + 2;
            if (c2 <= a.length - 1 - k) {
                if (a[c1] >= a[c2]) {
                    if (a[indexChildren] < a[c1]) {
                        changeMembers(a, indexChildren, c1);
                        indexChildren = c1;
                        continue;
                    }
                } else if (a[indexChildren] < a[c2]) {
                    changeMembers(a, indexChildren, c2);
                    indexChildren = c2;
                    continue;
                }
            }
            if (a[indexChildren] < a[c1]) {
                changeMembers(a, indexChildren, c1);
            }
            break;
        }
    }

    public static void changeMembers(int[] a, int id1, int id2) {
        int tmp = a[id1];
        a[id1] = a[id2];
        a[id2] = tmp;
    }
}

