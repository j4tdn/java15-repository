package generic;

import java.util.Arrays;
import java.util.List;

public class Ex03GenericWildCard {
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		List<Double> decimals = Arrays.asList(5d, 66d, 666d);

		printf(numbers);
		printf(decimals);

	}

	private static void printf(List<?> elements) {
		for (Object element : elements) {
			System.out.println(element + " ");
		}
		System.out.println();

	}
}
