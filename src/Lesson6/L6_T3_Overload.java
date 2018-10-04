package Lesson6;

public class L6_T3_Overload {
    public static void main(String[] args) {
        byte b = 1;
        System.out.println("Размер в байтах для byte равен " + getTypeSize(b));
        short s = 1;
        System.out.println("Размер в байтах для short равен " + getTypeSize(s));
        System.out.println("Размер в байтах для int равен " + getTypeSize(1));
        System.out.println("Размер в байтах для long равен " + getTypeSize(1L));
        System.out.println("Размер в байтах для float равен " + getTypeSize(1f));
        System.out.println("Размер в байтах для double равен " + getTypeSize(1d));
    }

    public static int getTypeSize(byte a) {
        return 1;
    }

    public static int getTypeSize(short a) {
        return 2;
    }

    public static int getTypeSize(int a) {
        return 4;
    }

    public static int getTypeSize(long a) {
        return 8;
    }

    public static int getTypeSize(float a) {
        return 4;
    }

    public static int getTypeSize(double a) {
        return 8;
    }
}
