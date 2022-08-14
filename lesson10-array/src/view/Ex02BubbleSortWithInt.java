package view;

import java.util.Arrays;

import utils.CompareIntHelper;
import utils.CompareHelperAsc;
import common.SortDir;
import utils.SortUtils;

public class Ex02BubbleSortWithInt {
	public static void main(String[] args) {
		int[] numbers = { 1, 5, 11, 9, 4, 6 };

		sort(numbers, (pre, next) -> pre < next);
		System.out.println(Arrays.toString(numbers));

		sort(numbers, new CompareHelperAsc());
		System.out.println(Arrays.toString(numbers));
	}

	// strategy pattern
	// callback function
	private static void sort(int[] source, CompareIntHelper helper) {
		for (int round = 0; round < source.length; round++) {
			for (int i = 0; i < source.length - round - 1; i++) {
				if (helper.compare(source[i], source[i + 1])) {
					SortUtils.swap(source, i, i + 1);
				}
			}
		}
	}

	// default --> asc
	private static void sort(int[] source) {
		for (int round = 0; round < source.length; round++) {
			for (int i = 0; i < source.length - round - 1; i++) {
				if (source[i] > source[i + 1]) {
					SortUtils.swap(source, i, i + 1);
				}
			}
		}
	}
}
