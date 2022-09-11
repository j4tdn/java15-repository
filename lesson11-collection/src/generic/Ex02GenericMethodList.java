package generic;

import java.util.Arrays;
import java.util.List;

public class Ex02GenericMethodList {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		List<Double> decimals = Arrays.asList(5d, 55d, 555d);

		printf(numbers);
		printf(decimals);
	}

	private static <T extends Number> void printf(List<T> elements) {
		for (T element : elements) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
	
}
