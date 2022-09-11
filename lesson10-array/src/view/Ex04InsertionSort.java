package view;

import java.util.Arrays;

import utils.CompareIntHelper;
import utils.SortUtils;

public class Ex04InsertionSort {
	public static void main(String[] args) {
		int[] numbers = {1, 9, 5, 36, 12, 33};
		
		CompareIntHelper compareHelper = new CompareIntHelper() {
			
			@Override
			public boolean compare(int pre, int next) {
				return pre < next;
				
			}
		};
		CompareIntHelper compareHelper2 = (pre, next) -> pre <  next;
	
		
		insertionSort(numbers, compareHelper2);
		System.out.println(Arrays.toString(numbers));
	}
	
	private static void insertionSort(int[] numbers, CompareIntHelper compareHelper) {
		for (int round = 1; round < numbers.length; round++) {
			for (int i = 0; i < round; i++) {
				if(compareHelper.compare(numbers[round], numbers[i])) {
					SortUtils.swap(numbers, round, i);
				}
			}
		}
	}
}
