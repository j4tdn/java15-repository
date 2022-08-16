package utils;

import bean.ItemDetail;

public class SortUtils {
	public SortUtils() {
		
	}
	
	public static void swap (int[] source, int i, int j) {
		int temp = source[i];
		source[i]=source[j];
		source[j] = temp;
	}
	
	public static void swap (String[] source, int i, int j) {
		String temp = source[i];
		source[i]=source[j];
		source[j] = temp;
	}
	
	public static void swap (ItemDetail[] source, int i, int j) {
		ItemDetail temp = source[i];
		source[i]=source[j];
		source[j] = temp;
	}
	
	
}
