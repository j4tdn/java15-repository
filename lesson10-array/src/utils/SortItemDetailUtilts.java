package utils;

import bean.ItemDetail;

public class SortItemDetailUtilts {
	private  SortItemDetailUtilts() {
		
	}
	public static void swap(ItemDetail[] source, int i,int j) {
		ItemDetail tmp = source[i];
		source[i] = source[j];
		source[j] = tmp;
	}	
	
}
