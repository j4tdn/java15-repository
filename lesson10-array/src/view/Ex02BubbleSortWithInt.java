package view;

import java.util.Arrays;

import common.SortDir;
import utils.CompareIntHelper;
import utils.CompareHelperAsc;
import utils.SortUtils;

public class Ex02BubbleSortWithInt {
	public static void main(String[] args) {
		int[] numbers = { 1, 5, 11, 9, 4, 6 };
//		sort(numbers);
//		sort(numbers, SortDir.ASC);
//		sort(numbers, (pre, next) -> pre < next);
//		System.out.println(Arrays.toString(numbers));
		
		sort(numbers, new CompareHelperAsc());
		System.out.println(Arrays.toString(numbers));
	}
	
	private static void sort(int[] numbers, CompareIntHelper helper) {
		for(int round = 0; round < numbers.length; round ++) {
			for(int i = 0; i < numbers.length - round - 1; i++) {
				if(helper.compare(numbers[i],numbers[i + 1])) {
					SortUtils.swap(numbers, i, i+1);
				}
			}
		}
	}
	
	private static void sort(int[] numbers, SortDir sortDir) {
		for(int round = 0; round < numbers.length; round ++) {
			for(int i = 0; i < numbers.length - round - 1; i++) {
				if(sortDir.equals(sortDir.ASC) && numbers[i] > numbers[i + 1]) {
					SortUtils.swap(numbers, i, i+1);
				}
			}
		}
	}
	
	private static void sort(int[] numbers) {
		for(int round = 0; round < numbers.length; round ++) {
			for(int i = 0; i < numbers.length - round - 1; i++) {
				if(numbers[i] > numbers[i + 1]) {
					SortUtils.swap(numbers, i, i+1);
				}
			}
		}
	}
}
