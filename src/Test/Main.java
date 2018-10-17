package Test;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // создаем массив объектов Employee
        Employee[] empArr = new Employee[4];

// заполняем массив объектов Employee данными
        empArr[0] = new Employee(10, "Andrew", 21, 10000);
        empArr[1] = new Employee(20, "Dmitriy", 49, 20000);
        empArr[2] = new Employee(5, "Viktor", 45, 5000);
        empArr[3] = new Employee(1, "Alex", 42, 50000);

// сортируем массив с использованием Comparable
        Arrays.sort(empArr);
        System.out.println("Стандартная сортировка для массива объектов Employee:\n"+Arrays.toString(empArr));
    }
}
