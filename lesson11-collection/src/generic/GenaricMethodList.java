package generic;

import java.util.Arrays;
import java.util.List;

public class GenaricMethodList {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		List<Double> decimal = Arrays.asList(5d, 55d, 555d);
 		prinf(numbers);
 		prinf(decimal);
	}
	private static <T extends Number> void prinf(List<T> numbers) {
		for(T element : numbers) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}
