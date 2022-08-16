package view;
// s1.compare(s2) : s1 > s2.
import java.util.Arrays;

import utils.CompareIntHelper;
import utils.CompareStringHepler;
import utils.SortUtils;

public class Ex03BubbleSortWithString {
	public static void main(String[] args) {
		String[] sequences = {"Alex", null, null,"QuanGay", "Blue", "Cat"};
//		sortHandleNullValues(sequences);
//		System.out.println(Arrays.toString(sequences));
//		String[] textArray = {"Alex", null, null,"QuanGay", "Blue", "Cat"};
//		selectionSortKeepCurrentPositionNullValues(textArray);
		System.out.println(Arrays.toString(textArray));
		
		System.out.println("======Using strategy============================");
		String[] items= {"Item1", "Item2", "Item3", "Item4", "Item5", null, null};
		sort(items, new CompareStringHepler() {
			
			@Override
			public int compare(String s1, String s2) {
				//B1: null First
				if(s1 == null) {
					return -1;
				}
				//s1 khac null , s2 = null thi hoan vi
				if(s2 == null) {
					return 1;
				}
				return s1.compareTo(s2);
			}
		});
		System.out.println(Arrays.toString(items));
	}
	
	// using strategy pattern
	private static void sort(String[] source, CompareStringHepler hepler) {
		for(int round = 0; round < source.length  ; round++) {
			for ( int i = 0 ; i < source.length-round-1; i++) {
				//if (source[i].compareTo(source[i+1]) > 0 ) {
				if(hepler.compare(source[i], source[i+1]) > 0) {
					SortUtils.swap(source,i,i+1);
				}
			}
		}
	}
	
	

	private static void sortHandleNullLast(String[] source) {
		for(int round = 0; round < source.length -1 ; round++) {
			for ( int i = 0 ; i < source.length-round-1; i++) {
				// B1: Xử lí null last
				if(source[i] == null && source[i+1] != null) {
					SortUtils.swap(source, i, i+1);
					continue;
				}
				//Trước khác null, sau null thì hoán vị
				if(source[i+1] == null) {
					continue;
				}
				// pre != null; next !=null
				// B2: Sắp xếp tăng dần cho những phần tử khác null
				if (source[i].compareTo(source[i+1]) > 0 ) {
					SortUtils.swap(source,i,i+1);
				}
			}
		}
	}
	
	//A.compareto(B)
	// Xử lí null Values ---> sử dụng [null first], null last
	// Sau đó những phần tử khác null --> sắp xếp [tăng]/ giảm dần
	private static void sortHandleNullValues(String[] source) {
		for(int round = 0; round < source.length -1 ; round++) {
			for ( int i = 0 ; i < source.length-round-1; i++) {
				// B1: Xử lí null first
				if(source[i] == null) {
					continue;
				}
				//Trước khác null, sau null thì hoán vị
				if(source[i+1] == null) {
				SortUtils.swap(source, i, i+1);
				}
				// pre != null; next !=null
				// B2: Sắp xếp tăng dần cho những phần tử khác null
				if (source[i].compareTo(source[i+1]) > 0 ) {
					SortUtils.swap(source,i,i+1);
				}
			}
		}
	}
	// default --> asc(tang dan)
	//So sánh String sử dụng hàm compareTo
	private static void sort(String[] source) {
		for(int round = 0; round < source.length -1 ; round++) {
			for ( int j = 0 ; j < source.length-round-1; j++) {
				if (source[j].compareTo(source[j+1]) > 0 ) {
					SortUtils.swap(source,j,j+1);
				}
			}
		}
	}
	
	private static void selectionSortKeepCurrentPositionNullValues(String[] source) {
		for (int pivot = source.length -1;pivot > 0 ;pivot--) {
			if(source[pivot] != null) {
				for ( int i = 0; i < pivot ; i++ ) {
					if(source[i].compareTo(source[pivot]) > 0) {
						SortUtils.swap(source, i, pivot);
					}
				}
			}
		}
	}
}
