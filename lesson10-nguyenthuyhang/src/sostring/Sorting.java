package sostring;

import utils.CompareIntHelper;
import utils.SortUtils;

public class Sorting {
	private Sorting() {
		
	}
	public static void sortBubble(int[] source, CompareIntHelper helper) {
		for (int round = 0; round < source.length; round++) {
			for (int i = 0; i < source.length - round - 1; i++) {
				if (helper.compare(source[i], source[i + 1])) {
					SortUtils.swap(source, i, i+1)	;
				}
			}
		}
	}
	public static void selectionSort(int[] source, CompareIntHelper helper) {
		for (int round = source.length - 1; round > 0; round--) {
			for (int i = 0; i < round; i++) {
				if (helper.compare(source[round], source[i])) {
					SortUtils.swap(source, round, i);
				}
			}
		}
	}
	public static void insertionSort(int[] source, CompareIntHelper helper) {
		for (int round = 1; round < source.length; round++) {
			for (int i = 0; i < round; i++) {
				if (helper.compare(source[round], source[i])) {
					SortUtils.swap(source, round, i);
				}
			}
		}
	}
}

