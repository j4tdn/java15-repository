package view;

import java.util.Arrays;

import utils.CompareIntHelper;
import utils.SortUtils;

public class Ex03SelectionSort {
	public static void main(String[] args) {
		int[] numbers = {1, 9, 5, 36, 12, 33};
		CompareIntHelper compareHelper = new CompareIntHelper() {
			
			@Override
			public boolean compare(int pre, int next) {
				return pre > next;
			}
		};
		selectionSort(numbers, compareHelper);
		System.out.println(Arrays.toString(numbers));
		
	}
	
	private static void selectionSort(int[] numbers, CompareIntHelper compareHelper) {
		for (int round = numbers.length -1; round > 0; round--) {
			for (int i = 0;i < round; i++) {
				if(compareHelper.compare(numbers[round], numbers[i])) {
					SortUtils.swap(numbers, round, i);
				}
			}
		}
	} 
}
