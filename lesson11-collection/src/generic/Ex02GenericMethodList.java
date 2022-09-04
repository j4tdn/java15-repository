package generic;

import java.util.Arrays;
import java.util.List;

public class Ex02GenericMethodList {
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
		List<Double> doubles = Arrays.asList(5d, 55d, 555d);
		List<String> strings = Arrays.asList("a", "b", "c", "d");
		List<Number> numbers = Arrays.asList(1, 2, 3, 4, 5);
		
		printf(integers);
		printf(doubles);
		// printf(strings);
		printf(numbers);
		
	}

	// ? = T = Object
	// extends, super
	private static void printf(List<? extends Number> elements) {
		for (Object element : elements) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}