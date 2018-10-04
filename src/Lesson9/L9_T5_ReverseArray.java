package Lesson9;

public class L9_T5_ReverseArray {
    public static int[] array = {3, 6, 8, 3, 5, 12, 54, 234, 58, 333, 34, 8};

    public static void main(String[] args) {
        reverseArray(array);
        
        System.out.println("Перевернутый массив выглядит так:");
        int index = 0;
        for (int e : array) {
            System.out.println(index + " элемент " + e);
            ++index;
        }
    }

    public static void reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int tmpCell = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmpCell;
        }
    }
}

