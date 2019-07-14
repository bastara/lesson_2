package explore;

public class Trio {
    public static void main(String[] args) {
        int a = 0; // Начальное значение диапазона - "от"
        int b = 3; // Конечное значение диапазона - "до"

        int countWin = 0;
        int countLose = 0;

        for (int i = 0; i < 1000000; i++) {
            int made = a + (int) (Math.random() * b);//загадали 1 из 3х
//            System.out.println(made);

            int suggest = a + (int) (Math.random() * b);// предположили загаданное

            int tmp;//убираем 1 из 3
            do {
                tmp = a + (int) (Math.random() * b);
            } while (tmp == made || tmp == suggest);

//            System.out.println(suggest);
//            System.out.println(tmp);
//            System.out.println("--------------------");
            if (made == suggest) {
                countWin++;//выигрыши если не меняем своего мнения
            } else {
                countLose++;//выигрыши если меняем свое мнение
            }
        }
        System.out.println(countWin);
        System.out.println(countLose);
    }
}
