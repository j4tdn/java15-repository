package view;

import java.util.Arrays;

import utils.SortUtils;

public class Ex03BubbleSortWithString {
	public static void main(String[] args) {
		String[] sequences = {"Alex", "Terry", "Rivaldo", "Blue", "Zill" };
		sort(sequences);
		System.out.println(Arrays.toString(sequences));
	}
	
	// default --> asc
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
