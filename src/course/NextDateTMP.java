//package course;
//
//import java.text.DateFormat;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.Scanner;
//
//public class NextDateTMP {
//    public static void main(String[] args) throws ParseException {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите сегодняшнюю дату в формате DDMMYY");
//        String today = scanner.nextLine();
//
////        String today = "150918";
//        Date checkToday = new Date();
//        DateFormat dateFormat = new SimpleDateFormat("ddMMyy");
//
//        long dayToday = (dateFormat.parse(today).getTime() - 25200000) / 86400000;
//        long dayCheckToday = (checkToday.getTime() - 25200000) / 86400000;
////        System.out.println(dayToday + "   ------   " + ((dayToday - 25200000) / 86400000));
////        System.out.println(dayCheckToday + "   ------   " + ((dayCheckToday - 25200000) / 86400000));
//
//
//        SimpleDateFormat formatForDayNow = new SimpleDateFormat("dd.MM.yyyy");
////        System.out.println("-------------------" + formatForDayNow.format(checkToday));
//
//        if (dayToday == dayCheckToday) {
//            checkToday = new Date(checkToday.getTime() + 86400000);
////            System.out.println(checkToday);
//            System.out.println("Завтрашнее число " + formatForDayNow.format(checkToday));
//        } else {
//            System.out.println("Вы ввели не сегодняшнюю дату");
//
//        }
//
////        Date currentDate = new Date();
////        Long time3 = currentDate.getTime();
////        long anotherDate = -1;
////        time3 = time3 + (60*60*24*1000*anotherDate);
////        currentDate = new Date(time3);
////        System.out.println(time3);
////        System.out.println("Date currentDate = " + currentDate);
//
//
////        System.out.println(checkToday.toString());
////        System.out.println(dateFormat.parse(today));
//
//
////        date1 = dateFormat.parse(date);
//
////        ZonedDateTime now = ZonedDateTime.now(ZoneOffset.UTC);
////        System.out.println(now);
//
////        if (checkToday.compareTo(dateFormat.parse(today)) < 0) {
////            System.out.println("11111");
////        } else if (checkToday.compareTo(dateFormat.parse(today)) > 0) {
////            System.out.println("222222");
////        } else {
////            System.out.println("equal");
////        }
//    }
//}
