package Lesson9;

public class L9_T3_StringArray {
    public static String[] str = {"ПеревоД", "в", "заглАВНЫЕ", "символы", "всех", "букв", "Строки"};

    public static void main(String[] args) {
        System.out.println("Вот так выглядит массив до перевода:    " + String.join(" ", str));
        convertToUpperCase(str);
        System.out.println("Вот так выглядит массив после перевода:    " + String.join(" ", str));
    }

    public static void convertToUpperCase(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].toUpperCase();
        }
    }
}
