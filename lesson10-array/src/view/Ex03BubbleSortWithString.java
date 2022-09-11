package view;

import java.util.Arrays;

import utils.CompareStringHelper;
import utils.SortUtils;

public class Ex03BubbleSortWithString {
	public static void main(String[] args) {
		String[] sequences = { "Alex", null, "Terry", "Rivaldo", null, "Blue", "Zill" };
		sortHandleNullLastValue(sequences);
		System.out.println(Arrays.toString(sequences));
		
		
		
		
		System.out.println("=====================");
		String[] textArray = { "Alex", null, null, "Terry", "Rivaldo", "Blue", null, "Zill", "JamesRodigez" };
		selectionSortKeepCurrentNullValues(textArray);
		System.out.println(Arrays.toString(textArray));
		
		
		System.out.println("========Using stragency===========");
		String[] items= {null, null,"Item1","Item2",null,"Item3","Item4",null,"Item11"};
		sort(items, new CompareStringHelper() {
			
			//null first
			@Override
			public int compare(String s1, String s2) {
				if(s1==null) {
					return -1;
				}
				if(s2==null) {
					return 1;
				}
				
				
				return s1.compareTo(s2);
			}
		});
		System.out.println(Arrays.toString(items));
	}

	// using strategy pattern
	private static void sort(String[] source, CompareStringHelper helper) {
		for (int round = 0; round < source.length; round++) {
			for (int i = 0; i < source.length - round - 1; i++) {
				if (helper.compare(source[i], source[i+1])> 0) {
					SortUtils.swap(source, i, i + 1);
				}
			}
		}
	}

	// so sánh String dùng hàm compareTo
	// xử lí null value--> xử dụng null first or null last
	// Sau đó những phần tử khác null -> sắp xếp tăng hay giảm dần

	private static void sortHandleNullLastValue(String[] source) {
		for (int round = 0; round < source.length; round++) {
			for (int i = 0; i < source.length - round - 1; i++) {

				// Bước 1: Xử lý null last
				if (source[i] == null && source[i + 1] != null) {
					SortUtils.swap(source, i, i + 1);
					continue;
				}
				// pre!=null
				if (source[i + 1] == null) {
					continue;
				}

				// Bước 2:Sắp xếp tăng dần hay giảm dần cho những phần tử khác null
				if (source[i].compareTo(source[i + 1]) > 0) {
					SortUtils.swap(source, i, i + 1);
				}
			}
		}
	}

	private static void sortHandleNullFirstValue(String[] source) {
		for (int round = 0; round < source.length; round++) {
			for (int i = 0; i < source.length - round - 1; i++) {

				// Bước 1: Xử lý null first
				if (source[i] == null) {
					continue;
				}
				// pre!=null
				if (source[i + 1] == null) {
					SortUtils.swap(source, i, i + 1);
					continue;
				}

				// Bước 2:Sắp xếp tăng dần hay giảm dần cho những phần tử khác null
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
							SortUtils.swap(source, i, pivot);
						}
					}

				}
			}

		}
	}
}
