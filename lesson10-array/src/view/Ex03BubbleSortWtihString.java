package view;

import java.lang.reflect.Array;
import java.util.Arrays;

import utils.CompareStringHelper;
import utils.SortUtils;

public class Ex03BubbleSortWtihString {
	public static void main(String[] args) {
		String[] sequences = {"Alex",null, "Jerry", "Rivaldo", "Blue"};
		sortHandleNullValue(sequences);
		System.out.println(Arrays.toString(sequences));
		
		
		System.out.println("=======Using Strategy==========");
		String[] items = {"item 1", "item 3", "item 2", "item 4", "item 13"};
		sort(items, new CompareStringHelper() {
			
			@Override
			public int compare(String s1, String s2) {
				// TODO Auto-generated method stub
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
	
	private static void sort(String[] source) {
		for (int round = 0; round < source.length; round ++) {
			for (int i = 0;i < source.length - round -1; i++) {
				if (source[i].compareTo(source[i+1]) > 0) {
					SortUtils.swap(source, i, i+1);
				}
			}
		}
	}
	private static void sort(String[] source,CompareStringHelper helper) {
		for (int round = 0; round < source.length; round ++) {
			for (int i = 0;i < source.length - round -1; i++) {
				if (helper.compare(source[i], source[i+1]) > 0) {
					SortUtils.swap(source, i, i+1);
				}
			}
		}
	}
	private static void selectionSortKeepCurrentPositionNullValues(String[] source) {
		
	}
	private static void sortHandleNullValue(String[] source) {
		for (int i = 0; i < source.length; i++) {
			for (int j = 0;j < source.length - i -1; j ++) {
				
				if(source[i] == null) {
					continue;
				}
				if(source[i+1] ==null) {
					SortUtils.swap(source, i, i+1);
					continue;
				}
				if (source[i].compareTo(source[i+1]) > 0) {
					SortUtils.swap(source, i, i+1);
				}
			}
		}
	}
}
