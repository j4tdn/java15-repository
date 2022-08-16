package view;

import java.util.Arrays;

import utils.SortUtils;

public class Ex03BubbleSortWithString {
	public static void main(String[] args) {
		String[] sequences = { "Alex", null, null, "Terry", "Rivaldo", null, "Blue", "Zill" };
		sortHandleNullLast(sequences);
		System.out.println(Arrays.toString(sequences));
	}

//So sanh string su dung ham compareTo
	private static void selectionSortKeepCurrentNullValues(String[] source) {
		for (int pivot = source.length - 1; pivot > 0; pivot-- ) {
			for (int i = 0; i< pivot; i++) {
				if(source[i].compareTo(source[pivot]) > 0) {
					SortUtils.swap(source, i, i + 1);
				}
			}
		}
	}
	

	private static void sortHandleNullLast(String[] source) {
		for (int round = 0; round < source.length; round++) {
			for (int i = 0; i < source.length - round - 1; i++) {

				if (source[i] == null && source[i + 1] != null) {
					SortUtils.swap(source, i, i + 1);
					continue;
				}
					
			}

				
				if (source[ + 1] == null) {

				continue;
			}

				if (source[i].compareTo(source[i + 1]) > 0) {
				SortUtils.swap(source, i, i + 1);
				continue;
			}
		}
	}

	private static void sort(String[] source) {
		for (int round = 0; round < source.length; round++) {
			for (int i = 0; i < source.length - round - 1; i++) {
				if (source[i].compareTo(source[i + 1]) > 0) {
					SortUtils.swap(source, i, i + 1);
				}
			}
		}
	}
}
