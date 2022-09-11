package logic;

import java.util.Arrays;

public class ArraysTraining {
	public static void main(String[] args) {
		int[] numbers = {10, 23, 3, 8, 11, 2, 0, 30};
		System.out.println(Arrays.toString(addElement(numbers, 0, 9)));
	}
	private static int[] addElement(int[] numbers, int k, int number) {
		int[] result = new int[numbers.length + 1];
		for(int i = 0; i < numbers.length; i ++) {
			result[i] = numbers[i];
		}
		for (int i = k + 1; i < result.length; i++) {
			result[i] = numbers[i-1];
		}
		result[k] = number;
		return result;
	}
}
