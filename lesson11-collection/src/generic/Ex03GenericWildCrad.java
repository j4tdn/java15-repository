package generic;

import java.util.Arrays;
import java.util.List;

public class Ex03GenericWildCrad {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		List<Double> decimal = Arrays.asList(5d, 55d, 555d);
		List<String> sequences = Arrays.asList("a", "b", "c", "d");
 		prinf(numbers);
// 		prinf(decimal);
// 		prinf(sequences);
	}
	private static void prinf(List<? super Integer> numbers) {
		for(Object element : numbers) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}
