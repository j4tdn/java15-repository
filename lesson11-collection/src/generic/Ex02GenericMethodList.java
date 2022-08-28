package generic;

import java.util.Arrays;
import java.util.List;

public class Ex02GenericMethodList {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		List<Double> decimals = Arrays.asList(1.1d, 2.2d, 3.3d, 4.4d, 5.5d);
		
		printfList(numbers);
		printfList(decimals);
	}
	
	private static <T extends Number> void printfList(List<T> elements) {
		for(T element: elements) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}
