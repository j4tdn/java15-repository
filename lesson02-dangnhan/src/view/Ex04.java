package view;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		int [] numbers = {5 , 1, 3 , 11 ,25 ,30};
		
		Arrays.stream(numbers)
			  .filter(number -> number % 2 !=0)
			  .max();
		
		System.out.println(" " + getMaxOddNumber(numbers));
	}
	
	private static int getMaxOddNumber (int[] elements) {
		int max = Integer.MIN_VALUE;
		
		for (int element: elements) {
			if (element %2 != 0 && element > max) {
				max = element;
			} 
		}
		return max;
	}
}
