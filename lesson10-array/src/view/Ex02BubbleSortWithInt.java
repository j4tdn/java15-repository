package view;

import java.util.Arrays;
import java.util.Iterator;
import utils.*;
public class Ex02BubbleSortWithInt {
	public static void main(String[] args) {
		int[] numbers = { 1, 5, 11, 9, 4, 6 };
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length - i - 1; j++) {
				if (numbers[j] > numbers[j + 1]) {
					SortUtils.swap(numbers, j, j+1);
				}
			}

		}
		System.out.println("" + Arrays.toString(numbers));
		
	}
}
