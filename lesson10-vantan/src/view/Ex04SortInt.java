package view;

import java.util.Arrays;

import sorting.SortingInt;
import utils.CompareIntHelper;

public class Ex04SortInt {
	public static void main(String[] args) {
		int[] numbers = {21, 1, 4, 5, 3, 97, 34, 11, 44};
		//SortingInt.sortBubble(numbers, (i, j) -> i < j);
//		SortingInt.sortSelection(numbers, new CompareIntHelper() {
//			
//			@Override
//			public boolean compare(int i, int j) {
//				return i < j;
//			}
//		});
		SortingInt.sortInsetion(numbers, (i, j) -> i > j);
		System.out.println(Arrays.toString(numbers));
	}
}
