package generic;

import java.util.Arrays;
import java.util.List;

public class Ex02GenericMethodList {
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		List<Double> decimals = Arrays.asList(5d,66d,666d);
		
		printf(numbers);
		printf(decimals);
		
	}
	private static <E extends Number> void printf(List<E> elements) {
		for(E element : elements) {
			System.out.println(element + " ");
		}
		System.out.println();
	}
}
