package Test.extend;

public class Cat extends Animal {

    private String color;
    private String voice = "mau";

//    public int test = 8;
//
//    public static int i = 18;
//
//    final public static int F = 28;

    public Cat(boolean veg, String food, int legs) {
        super(veg, food, legs);
        this.color = "White";
    }

    public Cat(boolean veg, String food, int legs, String color) {
        super(veg, food, legs);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void getVoice() {
        System.out.println(voice);

    }

    public void getMath(int number) {
        System.out.println("test + number = " + (test + number));
        System.out.println("i + number = " + (i + number));
        System.out.println("F + number = " + (F + number));

    }
}
