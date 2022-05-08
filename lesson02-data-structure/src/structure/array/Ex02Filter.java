package structure.array;

import java.util.Arrays;

/**
 * 1. Tìm những phần tử lẻ trong mảng số nguyên
 * Input: Mảng
 * Output: mảng số lẻ  
 */
public class Ex02Filter {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6};
		int[] oddNumbers = findOddNumber(numbers);
		System.out.println(Arrays.toString(oddNumbers));
	}
	private static int[] findOddNumber(int[] Elements) {
		int[] oddElements = new int[Elements.length];
		int count = 0;
		for(int number: Elements) {
			if(number % 2 != 0) {
				oddElements[count] = number;
				count++;
			}
		}
		int[] result = new int[count];
		for(int i = 0; i < result.length; i++) {
			result[i] = oddElements[i];
		}
		
		return result;
	}
}
