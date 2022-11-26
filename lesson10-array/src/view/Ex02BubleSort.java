package view;

import java.util.Arrays;

import common.SortDir;
import utils.CompareIntHelper;
import utils.SortUtils;

public class Ex02BubleSort {
	public static void main(String[] args) {
		int[] numbers = {1, 5, 11, 9, 4, 6};
		sort(numbers,(pre,next)-> pre > next);
		System.out.println(Arrays.toString(numbers));
	}
	
	private static void sort(int[] source,CompareIntHelper helper) {
		for (int i = 0; i < source.length; i++) {
			for (int j = 0;j < source.length - i -1; j ++) {
				if (helper.compare(source[i], source[i+1])) {
					SortUtils.swap(source, i, i+1);
				}
			}
		}
	}
}
