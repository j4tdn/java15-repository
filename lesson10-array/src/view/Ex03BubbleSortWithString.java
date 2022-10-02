package view;

import java.util.Arrays;

import utils.CompareStringHelper;
import utils.SortUtils;

public class Ex03BubbleSortWithString {
	public static void main(String[] args) {
		String[] sequences = { "Alex", null, null, "Terry", "Rivaldo", "Blue", "Zill", null };
		sortHandleNullValue(sequences);
		System.out.println(Arrays.toString(sequences));

		System.out.println("=============================== Using Strategy ==================================");
		String[] items = { null, null, "Item 1", "Item 3", null, "Item 2", "Item 4", " Item 11" };
		sort(items, new CompareStringHelper() {

			@Override
			public int compare(String s1, String s2) {
				// TODO Auto-generated method stub
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
		System.out.println("================================================================================");
		String[] textArray = { "Alex", null, null, "Terry", "Rivaldo", "Blue", "Zill", null };
		selectionSortKeepCurrentNullValues(textArray);
		System.out.println(Arrays.toString(textArray));
	}

	// using strategy pattern
	private static void sort(String[] source, CompareStringHelper helper) {
		for (int round = 0; round < source.length; round++) {
			for (int i = 0; i < source.length - round - 1; i++) {
				if (helper.compare(source[i], source[i + 1]) > 0) {
					SortUtils.swap(source, i, i + 1);
				}
			}
		}
	}

	private static void sortHandleNullValue(String[] source) {
		for (int round = 0; round < source.length; round++) {
			for (int i = 0; i < source.length - round - 1; i++) {
				// B1 : Xu ly null last
				if (source[i] == null && source[i + 1] != null) {
					SortUtils.swap(source, i, i + 1);
					continue;
				}
				// pre != null
				if (source[i + 1] == null) {
					// SortUtils.swap(source, i, i + 1);
					continue;
				}
				// B2 : Sap xep tang dan cac phan tu khac null
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
							SortUtils.swap(source, i, pivot);
						}
					}

				}
			}

		}
	}

}
