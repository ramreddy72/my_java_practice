package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("ram", "swecha", "charanya");

		List<Character> ls = list.stream().flatMap((s) -> s.chars().mapToObj(c -> (char) c))
				.collect(Collectors.toList());
	
		System.out.println(ls);		
	}

}
