package Test.Comparator;

import java.util.Arrays;

public class JavaObjectSorting {

    // в этом классе сортируем массивы и списки
    // объектов с помощь. интерфейсов Comparable и Comparator
    public static void main(String[] args) {

        // создаем массив объектов
        Employee[] empArr = new Employee[4];
        empArr[0] = new Employee(10, "Andrew", 21, 10000);
        empArr[1] = new Employee(20, "Viktor", 49, 20000);
        empArr[2] = new Employee(5, "Lena", 45, 5000);
        empArr[3] = new Employee(1, "Alex", 42, 50000);

//        // сортируем массив с помощью интерфейса Comparable
//        Arrays.sort(empArr);
//        System.out.println("Стандартная сортировка:\n"+Arrays.toString(empArr));
//
//        // сортируем массив с помощью интерфейса Comparator по зарплате
//        Arrays.sort(empArr, Employee.SalaryComparator);
//        System.out.println("Comparator по зарплате:\n"+Arrays.toString(empArr));
//
//        //сортируем массив с помощью интерфейса Comparator по возрасту
//        Arrays.sort(empArr, Employee.AgeComparator);
//        System.out.println("Comparator по возрасту:\n"+Arrays.toString(empArr));
//
//        // сортируем массив с помощью интерфейса Comparator по имени
//        Arrays.sort(empArr, Employee.NameComparator);
//        System.out.println(" Comparator по имени:\n"+Arrays.toString(empArr));

        // сортируем массив по id и по имени с помощью Comparator
        empArr[0] = new Employee(1, "Mikhail", 23, 10000);
        empArr[1] = new Employee(20, "Viktor", 49, 20000);
        empArr[2] = new Employee(5, "Lena", 45, 5000);
        empArr[3] = new Employee(1, "Alex", 42, 50000);
        Arrays.sort(empArr, new CompByIdAndName());
        System.out.println("Сортируем по id и по имени:\n"+Arrays.toString(empArr));
    }

}