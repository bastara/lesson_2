package course;

import java.util.Scanner;

public class House {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Сколько подъездов в доме?");
        int entrancesCount = scanner.nextInt();
        System.out.println("Сколько этажей в подъезде?");
        int floorsCount = scanner.nextInt();
        System.out.println("Введите номер искомой квартиры");
        int flat = scanner.nextInt();

        int flatsOnFloor = 4;
        if (entrancesCount * floorsCount * flatsOnFloor < flat) {
            System.out.println("Такой квартиры в этом доме нет");
            return;
        }

        int findEntrance = (int) Math.ceil((double) flat / flatsOnFloor / floorsCount);
        System.out.println("Искомый подъезд номер " + findEntrance);

        int findFloor = (int) (Math.ceil(((double) flat - (findEntrance - 1) * floorsCount * flatsOnFloor) / flatsOnFloor));
        System.out.println("Искомый этаж номер " + findFloor);

        int position = flat % flatsOnFloor;
        switch (position) {
            case 1:
                System.out.println("Ближняя слева");
                break;
            case 2:
                System.out.println("Дальняя слева");
                break;
            case 3:
                System.out.println("Дальняя справа");
                break;
            default:
                System.out.println("Ближняя справа");
        }
    }
}

