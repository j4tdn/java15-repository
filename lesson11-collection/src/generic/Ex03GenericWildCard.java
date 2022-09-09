package generic;

import java.util.Arrays;
import java.util.List;

public class Ex03GenericWildCard {
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
		List<Double> doubles = Arrays.asList(1.1d, 2.2d, 3.3d, 4.4d, 5.5d);
		List<String> strings = Arrays.asList("a", "b", "c", "d");
		List<Number> numbers = Arrays.asList(1, 2, 3, 4, 5);

		printfList(integers);
		// printfList(doubles);
		// printfList(strings);
		printfList(numbers);
	}
	
	// ? = T = Object
	// extends, super
	private static void printfList(List<? super Integer> elements) {
		for(Object element: elements) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}
