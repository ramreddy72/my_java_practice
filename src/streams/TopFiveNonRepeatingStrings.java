package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TopFiveNonRepeatingStrings {
    public static void main(String[] args) {
        String str = "Instal the lates PowerShell for new features and improvements!";

        Arrays.stream(str.split(" ")).filter(s -> !isContainRepeatingChars(s))
                .sorted(Comparator.comparing(String::length).reversed())
                .limit(3)
                .forEach(System.out::println);

    }
    
    public static Boolean isContainRepeatingChars(String str) {
        
        return str.chars().mapToObj(c -> (char)c)
                  .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                  .entrySet()
                  .stream()
                  .filter(entry -> entry.getValue() > 1L)
                  .map(entry -> entry.getKey())
                  .findFirst()
                .isPresent();
    }
}
