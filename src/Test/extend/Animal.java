package Test.extend;

public class Animal {

    private boolean vegetarian;
    private String eats;
    private int noOfLegs;

    public int test = 2;

    public static int i = 12;

    final public static int F = 22;


    public Animal() {
    }

    public Animal(boolean veg, String food, int legs) {
        this.vegetarian = veg;
        this.eats = food;
        this.noOfLegs = legs;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public String getEats() {
        return eats;
    }

    public void setEats(String eats) {
        this.eats = eats;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public void getMath(int number) {
        System.out.println("test + number = " + (test + number));
        System.out.println("i + number = " + (i + number));
        System.out.println("F + number = " + (F + number));
    }
}
