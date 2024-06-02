package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import core_java.Employee;

public class GetMapOfStringAndListOfEmp {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "ram");
        Employee e2 = new Employee(2, "reddy");
        Employee e3 = new Employee(3, "palnati");
        Employee e4 = new Employee(4, "ram");
        Employee e5 = new Employee(5, "palnati");


        List<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);

        Map<String, List<Employee>> map = list.stream().collect(Collectors.groupingBy(Employee::getName));

        System.out.println(map);
    }
}
