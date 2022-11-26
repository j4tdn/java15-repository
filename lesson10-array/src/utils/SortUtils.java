package utils;

import bean.ItemDetail;

public class SortUtils {
	private SortUtils() {
		
	}
	public static void swap(ItemDetail[] elements, int i,int j) {
		ItemDetail tmp = elements[i];
		elements[i] = elements[j];
		elements[j] = tmp;
	}
}
