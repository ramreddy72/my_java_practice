package streams;

import java.util.Arrays;
import java.util.HashMap;
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

        //Grouping By map value
        Map<String, List<Person>> mapGroup = list.stream().collect(Collectors.groupingBy(Person::getSkill));

        System.out.println(mapGroup);


        //key points to member which will update the map
        StringBuilder key = new StringBuilder("ram");
        Map<StringBuilder, String> mapBuilder = new HashMap<>();
        mapBuilder.put(key, "ravan");
         System.out.println(mapBuilder);
        key.append("reddy");
        System.out.println("ms" + key);
        System.out.println(mapBuilder.get(key));
        System.out.println(mapBuilder);

        key.append("palnati");
        System.out.println(mapBuilder);

        
    }
}
