package Lesson8;

public class L8_T1_MaxSubstring {
    public static void main(String[] args) {
        String source = "аааа    2222233ааккЕЕЕЕЕееЕннррртттттВВВвввВВвввввВВвуцыф";

        System.out.println("Максимальная длина символов составляет " + getLengthMaxSubstring(source));
    }

    public static int getLengthMaxSubstring(String source) {
        source = source.toLowerCase();

        int tmpLength = 0;
        if (source.length() > 0) {
            tmpLength = 1;
        }
        int maxLength = tmpLength;
        for (int i = tmpLength; i < source.length(); i++) {
            if (source.charAt(i) == source.charAt(i - 1)) {
                tmpLength++;
            } else {
                tmpLength = 1;
            }
            if (tmpLength > maxLength) {
                maxLength = tmpLength;
            }
        }
        return maxLength;
    }
}
