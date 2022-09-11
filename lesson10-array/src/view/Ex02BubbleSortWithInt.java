package view;

import java.util.Arrays;

import javax.swing.text.Utilities;

import common.SortDir;
import utils.CompareIntHelper;
import utils.SortUtils;

public class Ex02BubbleSortWithInt {
	public static void main(String[] args) {
		int[] numbers = {1, 9, 5, 36, 12, 33};
		
		CompareIntHelper compareHelper = new CompareIntHelper() {
			
			@Override
			public boolean compare(int pre, int next) {
				return pre < next;
			}
		};
		CompareIntHelper compareDsc = (pre, next) -> pre < next;
		sort(numbers, compareDsc);
		System.out.println(Arrays.toString(numbers));
	}
	//default --> asc
	private static void sort(int[] source, CompareIntHelper helper) {
		for (int round = 0; round < source.length; round++) {
			for (int i = 0; i < source.length - round - 1; i++) {
				if(helper.compare(source[i], source[i + 1])) {
					SortUtils.swap(source, i, i+1);

				}
			}
		}
	}
}
