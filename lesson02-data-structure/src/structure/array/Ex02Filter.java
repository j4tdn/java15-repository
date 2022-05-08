package structure.array;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 
 * 
 *
 */
public class Ex02Filter {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6 };
		int[] oddNumbers = findOddNumbers(numbers);
		System.out.println(Arrays.toString(oddNumbers));

	}

	private static int[] findOddNumbers(int[] elements) {
		int[] oddElements = new int[elements.length];
		int count = 0;
		for (int element : elements) {
			if (!(element % 2 == 0)) {
				oddElements[count] = element;
				count++;
			}
		}
		int[] result = new int[count];
		for (int i = 0; i < count; i++) {
			result[i] = oddElements[i];
		}
		return result;
	}
}
