package Lesson8;

public class L8_T2_Palindrome {
    public static void main(String[] args) {
        String str = "Сани, плот и воз, зов и толп и нас";

        System.out.println(isPalindrome(str) ? "Это палиндром" : "Это не палиндром");
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();

        int symbol1Pos = 0;
        int symbol2Pos = str.length() - 1;

        while (symbol1Pos <= symbol2Pos) {
            if (!Character.isLetter(str.charAt(symbol1Pos))) {
                ++symbol1Pos;
                continue;
            }
            if (!Character.isLetter(str.charAt(symbol2Pos))) {
                --symbol2Pos;
                continue;
            }
            if (str.charAt(symbol1Pos) != str.charAt(symbol2Pos)) {
                return false;
            }
            ++symbol1Pos;
            --symbol2Pos;
        }
        return true;
    }
}