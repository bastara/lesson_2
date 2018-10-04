import java.util.Arrays;

public class Test {

    public static void main(String args[]) {
        char[] Str1 = {'п', 'р', 'и', 'в', 'е', 'т', ' ', 'м', 'и', 'р'};
        String Str2 = "";

        Str2 = Str2.copyValueOf(Str1);
        System.out.println("Возвращаемая строка: " + Str2);

        Str2 = Str2.copyValueOf(Str1, 2, 6);
        System.out.println("Возвращаемая строка: " + Str2);


        String line = "50 44 33.2";
        String[] words = line.split(" ");
        String[] twoWords = line.split(" ", 2);
        System.out.println("Используем разделитель: " + Arrays.toString(words));
        System.out.println();
        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
        System.out.println("Разделяем на 2 строки: " + Arrays.toString(twoWords));
        //метод split со специальным разделителем
        String wordsSpecial = "Как|использовать|метод|split";
        String[] numbers = wordsSpecial.split("\\|");
        System.out.println("метод split со специальным разделителем: " + Arrays.toString(numbers));


        String expression = "100.2+3+7";

        String inBracketsArr[] = expression.split("[-/*+]");
        double numArr[] = new double[inBracketsArr.length];
        System.out.println(inBracketsArr[0]);
        System.out.println(inBracketsArr[1]);
        System.out.println(inBracketsArr[2]);


        String s = "  --abc  678 .. Z";

        System.out.println("End " + delNoDigOrLet(s));


    }


    private static String delNoDigOrLet(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i)))
                sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}











