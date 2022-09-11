package view;

import java.util.Arrays;
import java.util.Iterator;

import utils.CompareIntHelper;
import utils.CompareStringHelper;
import utils.SortUtils;

public class Ex03BubbleSortWithString {
	public static void main(String[] args) {
		String[] sequences = {"Alex", null, "Terry", null, "Rivaldo", "Blue", "Zill"};
		sortHandleNullLast(sequences);
		System.out.println(Arrays.toString(sequences));
		String[] testArrays = {"Alex", null, "Terry", null, "Rivaldo", "Blue", "Zill"};
		//selectionSortKeepCurrentNullValue(testArrays);
		//System.out.println(Arrays.toString(testArrays));
		
		System.out.println("====================USING STRATEGY========================");
		String[] items = {"Item 1", null,"Item 3", null,"Item 2", null, "Item 4", "Item 11"};
		
		
		sort(items, new CompareStringHelper() {
			
			@Override
			public int compare(String s1, String s2) {
				//B1
				if(s1 == null) {
					return 1;
				}
				if(s2 == null) {
					return -1;
				}
				
				//B2: ASC
				return s2.compareTo(s1);
			}
		});
		System.out.println(Arrays.toString(items));
	}
	
	private static void sort(String[] source, CompareStringHelper helper) {
		for (int round = 0; round < source.length; round++) {
			for (int i = 0; i < source.length - round - 1; i++) {
				//source[i].compareTo(source[i + 1]
				if(helper.compare(source[i], source[i+1]) > 0) {
					SortUtils.swap(source, i, i+1);

				}
			}
		}
	}
	//
//	private static void selectionSortKeepCurrentNullValue(String[] source) {
//		for(int pivot = source.length- 1; pivot > 0; pivot++) {
//			for (int i = 0; i < pivot; i++) {
//				if(source[pivot] != null) {
//					if(source[i] != null && source[i].compareTo(source[pivot]) > 0) {
//						SortUtils.swap(source, i, i+1);
//					}
//				}
//				
//			}
//		}
//	}
	
	//xu ly null value --> xu dung null first, null last
	//sau do nhung phan tu khacs null --> sap xep tang hoac giam
	private static void sortHandleNullFirst(String[] source) {
		for (int round = 0; round < source.length; round++) {
			for (int i = 0; i < source.length - round - 1; i++) {
				//xu ly null first
				if(source[i] == null) {
					continue;
				}
				if(source[i+1] == null) {
					SortUtils.swap(source, i, i+1);
					continue;
				}
				
				//sap xep tang dan cho nhung phan tu khac null
				if(source[i].compareTo(source[i + 1]) < 0) {
					SortUtils.swap(source, i, i+1);

				}
			}
		}
		
	}
	private static void sortHandleNullLast(String[] source) {
		for (int round = 0; round < source.length; round++) {
			for (int i = 0; i < source.length - round - 1; i++) {
				//xu ly null first
				if(source[i] == null && source[i+1] != null) {
					SortUtils.swap(source, i, i+1);
					continue;
				}
				if(source[i+1] == null) {					
					continue;
				}
				
				//sap xep tang dan cho nhung phan tu khac null
				if(source[i].compareTo(source[i + 1]) < 0) {
					SortUtils.swap(source, i, i+1);

				}
			}
		}
		
	}
	//so sanh string su dung ham compareTo
	
}
