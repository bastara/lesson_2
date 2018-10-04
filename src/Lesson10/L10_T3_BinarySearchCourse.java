package Lesson10;

public class L10_T3_BinarySearchCourse {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 7, 10, 12};
        int pattern = 7;

        System.out.println("(рекурсия) Искомый элемент находится на " + binarySearch(array, 0, array.length - 1, pattern) + " позиции");
        System.out.println("(без рекурсии) Искомый элемент находится на " + binarySearch(pattern, array) + " позиции");
    }

    public static int binarySearch(int[] array, int left, int right, int pattern) {
        if (left > right) {
            return -1;
        }
        int middle = (right + left) / 2;
        if (array[middle] == pattern) {
            return middle;
        } else if (array[middle] < pattern) {
            middle = binarySearch(array, middle + 1, right, pattern);
        } else {
            middle = binarySearch(array, left, middle - 1, pattern);
        }
        return middle;
    }

    public static int binarySearch(int pattern, int[] array) {
        int left = 0;
        int right = array.length - 1;

        int middle;
        do {
            if (left > right) {
                return -1;
            }
            middle = (right + left) / 2;
            if (array[middle] < pattern) {
                left = middle + 1;
            } else if (array[middle] > pattern) {
                right = middle - 1;
            }
        } while (array[middle] != pattern);
        return middle;
    }
}
