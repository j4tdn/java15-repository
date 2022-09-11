package view;

import utils.CompareIntHelper;
import utils.SortUtils;
import java.util.Arrays;

import common.SortDir;

//Nổi bọt
//6 phần tử - 6 round
public class Ex02BubbleSortWithInt {
	public static void main(String[] args) {
		int[] numbers = { 1, 5, 11, 9, 4, 6 };
		// anonymous class
		CompareIntHelper helper = new CompareIntHelper() {

			@Override
			public boolean compare(int pre, int next) {
				return pre < next;
			}
		};
		// anonymous function(lamda)
		CompareIntHelper helperAsc = (int pre, int next) -> {
			return pre > next;
		};
		CompareIntHelper helperDesc = (pre, next) -> pre > next;

		sort(numbers, helperAsc);
		System.out.println(Arrays.toString(numbers));
		
		sort(numbers, (pre, next) -> pre <next);
		System.out.println(Arrays.toString(numbers));
	}

	// strategy pattern
	private static void sort(int[] source, CompareIntHelper helper) {
		for (int round = 0; round < source.length; round++) {
			for (int i = 0; i < source.length - round - 1; i++) {
				if (helper.compare(source[i], source[i + 1])) {
					SortUtils.swap(source, i, i + 1);
				}
			}
		}
	}

	private static boolean compareAsc(int pre, int next) {
		return pre > next;
	}

	private static boolean compareDesc(int pre, int next) {
		return pre < next;
	}

	// default->asc
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
