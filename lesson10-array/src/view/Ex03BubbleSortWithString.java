package view;

import java.util.Arrays;

import utils.CompareStringHelper;
import utils.SortUtils;

public class Ex03BubbleSortWithString {
	public static void main(String[] args) {
		String[] sequences = { "Alex", null, null, "Terry", "Rivaldo", null, "Blue", "Zill" };
//		sort(sequences);
//		sortHandleNullValues(sequences);
//		sortHandleNullLast(sequences);
		System.out.println(Arrays.toString(sequences));
		
		System.out.println("================"
				+ "=============");
		
		String[] textArray = { "Alex", null, null, "Terry", "Rivaldo", null, "Blue", "Zill" };
		selectionSortKeepCurrentNullValue(textArray);
		System.out.println(Arrays.toString(textArray));
		
		String[] items = {null, null, "Item1", "Item3", null, "Item2", "Item4", null, "Item11"};
		sort(items, new CompareStringHelper() {
			
			@Override
			public int compare(String s1, String s2) {
				// B1: Null first
				if(s1 == null) {
					return -1;
				}
				
				// s1 != null
				if(s2 == null) {
					return 1;
				}
				
				// B2: ASC
				return s1.compareTo(s2);
			}
		});
		
		System.out.println(Arrays.toString(items));
	}
	
	// using strategy pattern
	private static void sort(String[] source, CompareStringHelper helper) {
		for (int round = 0; round < source.length; round++) {
			for (int i = 0; i < source.length - round - 1; i++) {
				// if (source[i].compareTo(source[pivot]) >  0) {
				if (helper.compare(source[i], source[i + 1]) >  0) {
					SortUtils.swap(source, i, i + 1);
				}
			}
		}
	}
	
	private static void selectionSortKeepCurrentNullValue(String[] source) {
		for(int pivot =  source.length - 1; pivot > 0; pivot--) {
			if(source[pivot] != null) {
				for(int i = 0; i < pivot; i++) {
					if (source[i] != null) {
						if (source[i].compareTo(source[pivot]) >  0) {
							SortUtils.swap(source, i, pivot);
						}
					}
				}
			}		
		}
	}
	
	private static void sort(String[] source) {
		for (int round = 0; round < source.length; round++) {
			for (int i = 0; i < source.length - round - 1; i++) {
				if (source[i].compareTo(source[i + 1]) >  0) {
					SortUtils.swap(source, i, i + 1);
				}
			}
		}
	}

	// So sánh string --> sử dụng hàm compareTo
	// Xử lý null values --> sử dụng null first, null last
	// Sau đó những phần tử khác null --> sắp xếp tăng/giảm dần
	private static void sortHandleNullValues(String[] source) {
		for (int round = 0; round < source.length; round++) {
			for (int i = 0; i < source.length - round - 1; i++) {
				// B1: Xử lý null first 
				if(source[i] == null ){
					continue;
				}
				
				// pre != null
				if(source[i + 1] == null) {
					SortUtils.swap(source, i, i + 1);
					continue;
				}
				
				// B2: Sắp xếp tăng dần cho những phần tử khác null
				if (source[i].compareTo(source[i + 1]) >  0) {
					SortUtils.swap(source, i, i + 1);
				}
			}
		}
	}
	
	private static void sortHandleNullLast(String[] source) {
		for (int round = 0; round < source.length; round++) {
			for (int i = 0; i < source.length - round - 1; i++) {
				// B1: Xử lý null first 
				if(source[i] == null && source[i + 1] != null){
					SortUtils.swap(source, i, i + 1);
					continue;
				}
				
				// pre != null
				if(source[i + 1] == null) {
					continue;
				}
				
				// B2: Sắp xếp tăng dần cho những phần tử khác null
				if (source[i].compareTo(source[i + 1]) >  0) {
					SortUtils.swap(source, i, i + 1);
				}
			}
		}
	}
}
