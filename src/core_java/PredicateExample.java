package core_java;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven = num -> num % 2 == 0;

        System.out.println(isEven.test(21)); //true

        //predicate with list
        List<Integer> list = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9);
        list.stream().filter(isEven).forEach(System.out::println);

        //Combine Predicates
        Predicate<String> isNotNull = str -> str != null && !str.isEmpty();
        Predicate<String> isShorterThan5 = str -> str.length() < 5;

        Predicate<String> combinedPredicate = isNotNull.and(isShorterThan5);

        System.out.println(combinedPredicate.test("Java")); //op: true
        System.out.println(combinedPredicate.test("null"));  //op: false
        System.out.println(combinedPredicate.test("predicate")); //op: false
    }
}
