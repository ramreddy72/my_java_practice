package core_java;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> con = str -> System.out.println(str.toUpperCase());

        con.accept("ravan");

        List<String> list = Arrays.asList("Alice", "bob", "charlie");

        list.stream().forEach(con);
    }
}
