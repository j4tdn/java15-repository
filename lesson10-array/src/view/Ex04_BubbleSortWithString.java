package view;

import java.util.Arrays;

import common.CompareStringHelper;
import ultis.SortUtils;

public class Ex04_BubbleSortWithString {
	public static void main(String[] args) {
		String[] sequences = { "Alex", null, null, "Terry", "Rivaldo", null, "Blue", "Zill" };
		sortHandleNullLast(sequences);
		System.out.println(Arrays.toString(sequences));
		System.out.println("===================");
		
		String[] text = { "Alex", null, null, "Terry", "Rivaldo", null, "Blue", "Zill" };
		selectionSortKeepCurrentNullValues(text);
		System.out.println(Arrays.toString(text));
		System.out.println("=========dfgh========");
		String[] item = { "Item1", "Item3", "Item2","Item4", "Item11" };
		sort(item, new CompareStringHelper() {
			
			@Override
			public int compare(String s1, String s2) {
				if(s1 == null) {
					return -1;
				}
				if(s2 == null) {
					return 1;
				}
				return s1.compareTo(s2);
			}
		});
		System.out.println(Arrays.toString(item));


	}
	
	private static void sort(String[] source, CompareStringHelper helper) {
		for (int i = 0; i < source.length; i++) {
			for (int j = 0; j < source.length - i - 1; j++) {
				if (helper.compare(source[j], source[j + 1]) > 0) {
					SortUtils.swap(source, j, j + 1);
				}
			}
		}
	}

	private static void selectionSortKeepCurrentNullValues(String[] source) {
		for(int pivot = source.length - 1; pivot > 0; pivot--) {
			if(source[pivot] != null) {
				for(int i = 0; i < pivot; i++) {
					if(source[i] != null) {
						if(source[i].compareTo(source[pivot]) > 0) {
							SortUtils.swap(source, i, i + 1);
						}
					}
				}
			}
			
		}
	}

	private static void sortHandleNullLast(String[] source) {
		for (int i = 0; i < source.length; i++) {
			for (int j = 0; j < source.length - i - 1; j++) {
				// Handle: selection null first
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

	// compare string --> use function compareTo
	private static void sort(String[] source) {
		for (int i = 0; i < source.length; i++) {
			for (int j = 0; j < source.length - i - 1; j++) {

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
