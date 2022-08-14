package view;

import java.util.Arrays;

import utils.CompareIntHelper;
import utils.CompareHelperAsc;
import utils.SortUtils;

public class Ex04InsertionSort {
	public static void main(String[] args) {
		int[] numbers = { 1, 5, 11, 9, 4, 6 };
		sort(numbers, (pre, next) -> pre < next);
		System.out.println(Arrays.toString(numbers));

		sort(numbers, new CompareHelperAsc());
		System.out.println(Arrays.toString(numbers));
	}

	private static void sort(int[] source, CompareIntHelper helper) {
		for (int i = 1; i < source.length; i++) {
			for (int j = 0; j < i; j++) {
				if (helper.compare(source[i], source[j])) {
					SortUtils.swap(source, i, j);
				}
			}
		}
	}
}
