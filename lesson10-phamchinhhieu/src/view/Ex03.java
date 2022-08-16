package view;

import java.util.Arrays;

import utils.SortUtils;
public class Ex03 {
	public static void main(String[] args) {
		String[] sequences = { "Alex", null, null, "Terry", "Rivaldo", null, "Blue", "Zill", "6","3", "-2", "Special" };
		sortHandleNullLast(sequences);
		System.out.println("Tăng dần: " + Arrays.toString(sequences));
		System.out.println("================================");
		sortHandleNullValues(sequences);
		System.out.println("Giảm dần: " + Arrays.toString(sequences));


	}
	
	private static void sortHandleNullLast(String[] source) {
		for (int i = 0; i < source.length; i++) {
			for (int j = 0; j < source.length - i - 1; j++) {
				// Handle: selection null first7
				if (source[j] == "Special") {
					continue;
				}
				if (source[j + 1] == "Special") {
					SortUtils.swap(source, j, j + 1);
					continue;
				}
				if (source[j] == null && source[j + 1] != null) {
					SortUtils.swap(source, j, j + 1);
					continue;
				}
				if (source[j + 1] == null) {
					continue;
				}
				if (source[j].compareTo(source[j + 1]) > 0) {
					SortUtils.swap(source, j, j + 1);
				}
			}
		}
	}
	private static void sortHandleNullValues(String[] source) {
		for (int i = 0; i < source.length; i++) {
			for (int j = 0; j < source.length - i - 1; j++) {
				// Handle: selection null first
				if (source[j] == "Special" && source[j + 1] != null) {
					SortUtils.swap(source, j, j + 1);
					continue;
				}
				if (source[j + 1] == "Special") {
					continue;
				}
				if (source[j] == null) {
					continue;
				}
				if (source[j + 1] == null) {
					SortUtils.swap(source, j, j + 1);
					continue;
				}
				if (source[j].compareTo(source[j + 1]) > 0) {
					SortUtils.swap(source, j, j + 1);
				}
			}
		}
	}
}
