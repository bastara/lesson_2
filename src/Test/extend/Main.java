package Test.extend;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat(false, "milk", 4, "black");

        System.out.println("Cat is vegetaring?" + cat.isVegetarian());
        System.out.println("Cat eats " + cat.getEats());
        System.out.println("Cat has " + cat.getNoOfLegs() + " legs.");
        System.out.println("Cat color is " + cat.getColor());
        System.out.println("test " + cat.test);
        System.out.println("i " + cat.i);
        System.out.println("F " + cat.F);

        cat.getVoice();

        Animal a = new Cat(false, "milk", 4, "white");

        ((Cat) a).getVoice();
        System.out.println(((Cat) a).getColor());


        cat.getMath(12);
        System.out.println("____________________");
        a.getMath(12);
        System.out.println("____________________");
        System.out.println(a.test + "    " + a.getEats());

        System.out.println(a instanceof Cat);
        System.out.println(a instanceof Animal);

        System.out.println(a.i);

//        Так нельзя!
//        Cat t1 = (Cat) new Animal(true, "meat", 6);
//        t1.setColor("gggg");
//        t1.getColor();


    }

}
