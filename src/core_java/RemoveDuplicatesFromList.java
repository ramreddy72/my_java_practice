package core_java;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesFromList {
    
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        Employee e1 = new Employee(1, "ram");
        Employee e2 = new Employee(2, "reddy");
        Employee e3 = new Employee(1, "ram");
        Employee e4 = new Employee(3, "palnati");

        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);

        System.out.println(list);

        list.stream().distinct().forEach(System.out::println);

    }
}
