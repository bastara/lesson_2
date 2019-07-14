package Test;


import java.util.ArrayList;

public class EnumTest {

    static {
        System.out.println("Inside Static Initializer.");

        // fruits array
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Pear");

        // print fruits
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("End Static Initializer.\n");
    }

    public static void main(String[] args) {
        System.out.println("Inside Main Method.");
    }
}