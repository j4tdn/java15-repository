package structure.array;

import java.util.Arrays;

/**
 * 1 Tim nhung phan tu le trong mang so nguyen
 * Input : Mang
 * Output : Mang so le
 * 
 */

public class Ex02Filter {

	public static void main(String[] args) {
		int[] numbers = {23,25,16,28,66};
		int[] oddNumbers = findOddNumbers(numbers);
		System.out.println(Arrays.toString(oddNumbers));
	}
	// int[] elements = numbers
	private static int[] findOddNumbers(int[] elements) {
		int[] oddElements = new int[elements.length];
		int count = 0;
		for(int element : elements) {
			if(element % 2 != 0) {
				oddElements[count] = element;
				count++;
				
			}
		}
		int[] result = new int[count];
		for (int i = 0; i< count; i++) {
			result[i] = oddElements[i];
		}
		return result;
	}

}
