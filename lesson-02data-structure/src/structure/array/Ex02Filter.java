package structure.array;

import java.util.Arrays;

/**
 * 1. tim những phần tử lẻ trong mảng số nguyên input: mảng output: mảng số lẻ
 */
public class Ex02Filter {
	public static void main(String[] args) {
		int[] numbers = { 1, 3, 4, 6, 7, 8, 13, 29 };
		int[] oddNumbers = findOdnumbers(numbers);
		System.out.println(Arrays.toString(oddNumbers));
	}
	
	private static int[] findOdnumbers(int[] elements) {
		int[] oddElement = new int[elements.length];
		int count = 0;
		for (int element : elements) {
			if(element % 2 != 0) {
				oddElement[count] = element;
				count++;
			}
		}
		int[] result = new int[count];
		for (int i = 0; i < result.length; i++) {
			result[i] = oddElement[i];
		}
		return result;
	}
}
