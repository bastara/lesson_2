package explore;

public class Share {
    public static void main(String[] args) {
        int a = 0; // Начальное значение диапазона - "от"
        int b = 100; // Конечное значение диапазона - "до"

        int standart = 0;
        int risk = 0;
        int countChance = 0;

        //считаем выигрыш при 100% шансе 700р и при 75% шансе 750р

        for (int i = 0; i < 1000000; i++) {
            standart += 700;
            int chance = a + (int) (Math.random() * b);
            if (chance < 75) {
                countChance++;
                risk += 933;
            }
        }
        System.out.println(standart);
        System.out.println(risk);
        System.out.println(countChance);
    }
}
