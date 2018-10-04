package course;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class NextDate {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сегодняшнюю дату в формате DDMMYY");
        String today = scanner.nextLine();

        Date checkToday = new Date();
        DateFormat dateFormat = new SimpleDateFormat("ddMMyy");

        SimpleDateFormat formatForDayNow = new SimpleDateFormat("dd.MM.yyyy");

        long dayToday = (dateFormat.parse(today).getTime() - 25200000) / 86400000;
        long dayCheckToday = (checkToday.getTime() - 25200000) / 86400000;
        if (dayToday == dayCheckToday) {
            checkToday = new Date(checkToday.getTime() + 86400000);
            System.out.println("Завтрашнее число " + formatForDayNow.format(checkToday));
        } else {
            System.out.println("Вы ввели не сегодняшнюю дату");
        }
    }
}
