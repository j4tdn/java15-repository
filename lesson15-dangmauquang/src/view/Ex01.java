package view;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 5, 6, 5, 5, 3, 1};
		
		int[] uniqueNumbers = getUniqueNumbers(numbers);
		for(Integer number: uniqueNumbers) {
			System.out.print(number + " ") ;
		}
		System.out.println("\n==================");
		
		int[] duplicatedNumbers = getDuplicateNumbers(numbers);
		for(Integer number: duplicatedNumbers) {
			System.out.print(number + " ");
		}
 	}
	
	private static int[] getUniqueNumbers(int[] numbers) {
		boolean[] flags = new boolean[numbers.length];
		for (int pivotIndex = 0; pivotIndex < numbers.length; pivotIndex++) {
			if (flags[pivotIndex]) continue;
			for (int i = 0; i < numbers.length; i++) {
				if (pivotIndex != i && numbers[pivotIndex] == numbers[i]) {
					flags[pivotIndex] = true;
					flags[i] = true;
				}
			}
		}
		int[] result = new int[numbers.length];
		int count = 0;
		for (int i = 0; i < flags.length; i++) {
			if (!flags[i]) {
				result[count++] = numbers[i];
			}
		}
		
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static int[] getDuplicateNumbers(int[] numbers) {
		boolean[] flags = new boolean[numbers.length];
		for (int pivotIndex = 0; pivotIndex < numbers.length; pivotIndex++) {
			if (flags[pivotIndex]) continue;
			for (int i = 0; i < numbers.length; i++) {
				if (pivotIndex != i && numbers[pivotIndex] == numbers[i]) {
					flags[pivotIndex] = true;
					flags[i] = true;
				}
			}
		}
		int[] result = new int[numbers.length];
		int count = 0;
		for (int i = 0; i < flags.length; i++) {
			if (flags[i]) {
				result[count++] = numbers[i];
			}
		}
		
		return Arrays.copyOfRange(result, 0, count);
	}
}
