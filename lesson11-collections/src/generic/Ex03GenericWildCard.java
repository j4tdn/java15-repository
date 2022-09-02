package generic;

import java.util.Arrays;
import java.util.List;

public class Ex03GenericWildCard {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		List<Double> decimals = Arrays.asList(5d, 55d, 555d);
		List<String> sequences = Arrays.asList("a", "b", "c", "d");

		printf(numbers);
//		printf(decimals);
//		printf(sequences);
	}

	// ? = T = Object
	// extends, super
	private static void printf(List<? super Integer> elements) {
		for (Object element : elements) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}
