package streams;

import java.util.Arrays;
import java.util.List;

public class PredictReduceOutput {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("ABC", "CAB", "BCA");

        String result = list.stream().reduce("", (a, b) -> a + b.charAt(1));
        System.out.println(result);

        
        String result1 = list.stream().reduce((a, b) -> a + b.charAt(1)).get().toString();
        System.out.println(result1);
    }
}
