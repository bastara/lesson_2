package Test.Comparator;

import java.util.Comparator;

public class CompByIdAndName implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        // отнимает id и получаем результат в переменную flag
        int flag = o1.getId() - o2.getId();

        // если получили 0, то сортируем по имени
        if(flag == 0) flag = o1.getName().compareTo(o2.getName());
        return flag;
    }
}