package logic;

import java.util.Arrays;
import java.util.Random;

public class logicArray {
	
	public static void main(String[] args) {
		int[] numbers = new int[15];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = new Random().nextInt(-10, 100);
		}
		System.out.println(Arrays.toString(numbers));
		int sumNegative = 0;
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] < 0) {
				sumNegative += numbers[i];
				count++;
			}
		}
		int average = sumNegative / count;
		System.out.println(average);
		for (int i = 0; i < numbers.length; i++) {
			if(isPrimeNumber(numbers[i])) {
				System.out.print(numbers[i] + " ");
			}
		}
		System.out.println();
		System.out.println(Arrays.toString(sortArray(numbers)));
		
	}
	private static boolean isPrimeNumber(int number) {
		if(number < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
	}
	private static int[] sortArray(int[] numbers) {
		for (int i = numbers.length -1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if(numbers[i] < numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		return numbers;
	}
}
