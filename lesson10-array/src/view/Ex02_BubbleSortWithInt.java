package view;

import java.lang.reflect.Array;
import java.util.Arrays;

import common.CompareIntHelper;
import common.SortDir;
import ultis.SortUtils;

public class Ex02_BubbleSortWithInt {
	public static void main(String[] args) {
		int[] number = { 1, 5, 11, 9, 4, 6 };
		//sort(number);
	//	System.out.println(Arrays.toString(number));
		//anonymous function
		CompareIntHelper helperAsc = (int pre, int next) ->{
			return pre > next;
		};
		CompareIntHelper helperDesc = (pre,next) -> pre < next;
		sort(number, helperDesc);
		System.out.println(Arrays.toString(number));

		
	}
	private static void sort(int[] number) {
		int temp = 0;
		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number.length - i - 1; j++) {
				if (number[j] > number[j + 1]) {
					SortUtils.swap(number, j, j + 1);
				}
			}
		}
	}

	private static void sort(int[] number, CompareIntHelper helper) {
		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number.length - i - 1; j++) {
				if (helper.compare(number[j], number[j + 1])) {
					SortUtils.swap(number, j, j + 1);
				}
			}
		}
	}
}
