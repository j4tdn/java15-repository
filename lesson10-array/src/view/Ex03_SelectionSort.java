package view;

import java.util.Arrays;

import ultis.SortUtils;

public class Ex03_SelectionSort {
	public static void main(String[] args) {
		int[] number = { 1, 5, 111, 19, 7, 2 };
		sort(number);
		System.out.println(Arrays.toString(number));
	}
	
	private static void sort(int[] number) {
		for (int i = number.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (number[j] > number[i]) {
					SortUtils.swap(number, j, i);
				}
			}
		}
	}
}
