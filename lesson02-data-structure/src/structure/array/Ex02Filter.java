package structure.array;

import java.util.Arrays;

/**
 * 1. Tim kiem nhung phan tu le trong mang so nguyen Input: An Array Output:
 * Array of odd numbers
 */
public class Ex02Filter {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 4, 5, 6 };
		int[] odds = findOdds(numbers);
		System.out.println(Arrays.toString(odds));
	}
	
	private static int[]  findOdds(int[] elements) {
		int[] oddElements = new int[elements.length];
		int index = 0;
		for(int element: elements) {
			if(element % 2 != 0) {
				oddElements[index] = element;
				index++;
			}
		}
		int[] result = new int[index];
		for(int i = 0; i < index; i++) {
			result[i] = oddElements[i];
		}
		return result;
	}
}
