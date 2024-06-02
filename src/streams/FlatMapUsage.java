package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapUsage {
    	public static void main(String[] args) {
		List<String> list = Arrays.asList("ram", "swecha", "charanya");

		List<Character> ls = list.stream().flatMap((s) -> s.chars().mapToObj(c -> (char) c))
				.collect(Collectors.toList());
	
		System.out.println(ls);
		
		int[] array1 = {1, 7, 3};
		int[] array2 = { 4, 5, 9 };
		int[] array3 = {9, 11,14};

        // Create a stream of arrays and flatten it using flatMap
        Stream<Integer> combinedStream = Stream.of(array1, array2,array3 )
                .flatMapToInt(Arrays::stream) // flatMapToInt converts IntStream to Stream<Integer>
                .boxed(); // Convert IntStream to Stream<Integer>

        // Print the elements of the combined stream
		combinedStream.forEach(System.out::println);
		
		//other
		//Stream.of(array1, array2).flatMapToInt(Arrays::stream).boxed().sorted().forEach(System.out::println);
	}
}
