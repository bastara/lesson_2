package Lesson8;

public class L8_T1_MaxSubstring {
    public static void main(String[] args) {
        String source = "ааааааккЕЕЕЕЕееЕннррртттттВВВвввВВвввввВВвуцыф";

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
            if (tmpLength > maxLength) {//как лучше сделать-что бы при каждой итерации проверка была или только при смене буквы и еще раз после цикла? Пока так сделал-так короче.
                maxLength = tmpLength;
            }
        }
        return maxLength;
    }
}
