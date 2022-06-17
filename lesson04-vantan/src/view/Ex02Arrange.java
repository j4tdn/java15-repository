package view;

import java.util.Arrays;

public class Ex02Arrange {
	public static void main(String[] args) {
		int[] numbers = {10, 89, 15, 35, 40, 21, 28, 70, 90, 5, 3, 9 , 22, 5, 21, 140, 2, 0 , 11, 63, 42};
		int n = 21;
		System.out.println(Arrays.toString(arrange(numbers, n)));
	}
	private static int[] arrange(int [] numbers, int n) {
		int[] result = new int[n];
		int i = 0;
//		int k = numbers.length-1;
		for (int j = 0; j < numbers.length; j++) {
			if(numbers[j] % 7 == 0 && numbers[j] % 5 != 0) {
				result[i++] = numbers[j];
			}
		}
		
		for (int j = 0 ; j < numbers.length; j++) {
			if(numbers[j] % 7 == 0 && numbers[j] % 5 == 0 || numbers[j] % 7 != 0 && numbers[j] % 5 != 0) {
				result[i++] = numbers[j];
				
			}
		}
		for (int j = 0; j < numbers.length; j++) {
			if(numbers[j] % 5 == 0 && numbers[j] % 7 != 0) {
				result[i++] = numbers[j];
			}
		}
		return result;
	}
}
