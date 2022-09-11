package logic;

import java.util.Arrays;

public class ArrayTrainning02 {
	public static void main(String[] args) {
		int[] numbers= {12, 11, 4, 0, 43, 2, 22};
		System.out.println(Arrays.toString(removeElement(numbers, 0)));
	}
	private static int[] removeElement(int[] numbers, int k) {
		int[] temp = numbers;
		for (int i = k; i < numbers.length -1; i++) {
			numbers[i] = numbers[i+1];
		}
		int[] result = new int[temp.length-1];
		for (int i = 0; i < result.length; i++) {
			result[i] = temp[i];
		}
		return result;
	}
}
