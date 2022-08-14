package view;

import java.util.Arrays;

import javax.sound.midi.Sequence;

import utils.CompareStringHelper;
import utils.SortUtils;

public class Ex03BubbleSortWithString {
	public static void main(String[] args) {
		String[] sequences = { "Alex", null, null, "Terry", "Rivaldo", null, "Blue", "Zill" };
		selectionSortKeepCurrentNullValues(sequences);
		System.out.println("Array: " + Arrays.toString(sequences));

		System.out.println("============Using stragety===========");
		String[] items = { "Item 1", null, null, "Item 3", null, "Item 4", "Item 2", "Item 11" };
		sort(items, new CompareStringHelper() {
			@Override
			public int compare(String s1, String s2) {
				if (s1 == null) {
					return -1;
				}
				if (s2 == null) {
					return 1;
				}
				return s1.compareTo(s2);
			}
		});
		System.out.println(Arrays.toString(items));
	}

	// using stragety pattern

	private static void sort(String[] source, CompareStringHelper helper) {
		for (int round = 0; round < source.length; round++) {
			for (int i = 0; i < source.length - round - 1; i++) {
				if (helper.compare(source[i], source[i + 1]) > 0) {
					SortUtils.swap(source, i, i + 1);
				}
			}
		}
	}

	// So sánh String --> sử dụng hàm compareTo
	// B1: Xử lý null values --> Sử dụng [null first], null last
	// B2: Những phần tử khác null --> sắp xếp [tăng]/giảm

	private static void sortHandleNullFirst(String[] source) {
		for (int round = 0; round < source.length; round++) {
			for (int i = 0; i < source.length - round - 1; i++) {
				// B1: null first
				if (source[i] == null) {
					continue;
				}
				// pre != null
				if (source[i + 1] == null) {
					SortUtils.swap(source, i, i + 1);
					continue;
				}

				// B2: ascending
				if (source[i].compareTo(source[i + 1]) > 0) {
					SortUtils.swap(source, i, i + 1);
				}
			}
		}
	}

	private static void sortHandleNullLast(String[] source) {
		for (int round = 0; round < source.length; round++) {
			for (int i = 0; i < source.length - round - 1; i++) {
				// B1: null first
				if (source[i] == null && source[i + 1] != null) {
					SortUtils.swap(source, i, i + 1);
					continue;
				}
				// pre != null
				if (source[i + 1] == null) {
					continue;
				}

				// B2: ascending
				if (source[i].compareTo(source[i + 1]) > 0) {
					SortUtils.swap(source, i, i + 1);
				}
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

	private static void selectionSortKeepCurrentNullValues(String[] source) {
		for (int pivot = source.length - 1; pivot > 0; pivot--) {
			if (source[pivot] != null) {
				for (int i = 0; i < pivot; i++) {
					if (source[i] != null) {
						if (source[i].compareTo(source[pivot]) > 0) {
							SortUtils.swap(source, pivot, i);
						}
					}
				}
			}
		}
	}
}
