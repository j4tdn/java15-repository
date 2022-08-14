package utils;

import bean.ItemDetail;

public class SortUtils {
	private SortUtils(){
		
	}
	 public static void swap(int [] source, int i, int j) {
		int tmp = source[i];
		source[i] = source[j];
		source[j] = tmp;
		
		
	}
	 public static void swap(String[] source, int i, int j) {
			String tmp = source[i];
			source[i] = source[j];
			source[j] = tmp;
			
			
		}
	 public static void swap(ItemDetail[] source, int i, int j) {
			ItemDetail tmp = source[i];
			source[i] = source[j];
			source[j] = tmp;
			
			
		}

}
