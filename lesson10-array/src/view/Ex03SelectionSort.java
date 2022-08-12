package view;

import java.util.Arrays;

import utils.CompareHelper;
import utils.CompareHelperAsc;
import utils.SortUtils;

public class Ex03SelectionSort {
	public static void main(String[] args) {
		int[] numbers = { 1, 5, 11, 9, 4, 6 };
		sort(numbers, (pre, next) -> pre < next);
		System.out.println(Arrays.toString(numbers));

		sort(numbers, new CompareHelperAsc());
		System.out.println(Arrays.toString(numbers));
	}

	// 1, 5, 11, 9, 4, 6 (0)
	// 1, 4, 11, 9, 5, 6 (1)
	// 1, 4, 5, 9, 11, 6 (2)
	// 1, 4, 5, 6, 11, 9 (3)
	// 1, 4, 5, 6, 9, 11 (4)

	private static void sort(int[] source, CompareHelper helper) {
		for (int i = 0; i < source.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < source.length; j++) {
				if (helper.compare(source[minIndex], source[j])) {
					SortUtils.swap(source, minIndex, j);
				}
			}
		}
	}
}
