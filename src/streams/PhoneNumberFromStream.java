package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PhoneNumberFromStream {
    public static void main(String[] args) {
        
        List<Employee> list = new ArrayList<>();

        List<Long> phn = new ArrayList<>();
        phn.add(456545666L);
        phn.add(85465L);

        Employee e1 = new Employee(1, "ram", phn);
        Employee e2 = new Employee(2, "ss", phn);
        Employee e3 = new Employee(13, "abc", phn);
        Employee e4 = new Employee(4, "reddy", phn);

        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);

       String str =  list.stream()
            .flatMap(employee -> employee.getPhone().stream())
            .map(Object::toString) // Convert Long to String
               .collect(Collectors.joining(", "));
            
        System.out.println(str);

    }
}
