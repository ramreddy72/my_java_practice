package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CreateHashMapHandleDuplicate {
    
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(
            new Person("John", "Java"),
            new Person("Alice", "Python"),
            new Person("Bob", "Java"),
            new Person("Emma", "Python"),
            new Person("David", "C++")
        );

        Map<String, String> map = list.stream()
            .collect(Collectors.toMap(Person::getSkill, Person::getName, (existing, replacement) -> replacement));

        System.out.println(map);
    }
}
