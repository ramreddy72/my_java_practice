package streams;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2,3,4,5,6,7 };
		int[] arr2 = { 6, 8, 9 };

		OptionalDouble res = Arrays.stream(arr1).average();
		
		if (res.isPresent()) {
			System.out.println("average : " + res.getAsDouble());
		}
	}

}
