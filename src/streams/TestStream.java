package streams;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
public class TestStream {

	public static void main(String[] args) {
		String str = "ABCEDFGABD";

		List<String> list = new ArrayList<>();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				list.add(str.substring(i, j + 1));
			}
		}
		System.out.println(list);

		Optional<String> result = list.stream().filter(s -> isContainRepeatedChar(s))
				.sorted(Comparator.comparing(String::length).reversed())
				.limit(1)
				.findFirst();

		System.out.println(result.isPresent() ? result.get().length() : "not exits");

	}
	
	public static boolean isContainRepeatedChar(String str) {
		
		return !str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet()
				.stream()
				.filter(entry -> entry.getValue() > 1)
				.map(entry -> entry.getKey())
				.findAny().isPresent();
	}
}
