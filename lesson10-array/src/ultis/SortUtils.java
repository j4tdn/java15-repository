package ultis;

import bean.ItemDetail;

public class SortUtils {
		public SortUtils() {
			// TODO Auto-generated constructor stub
		}
	
		public static void swap(int[] number, int i, int j) {
			int temp;
			temp = number[i];
			number[i] = number[j];
			number[j] = temp;
	
		}
		public static void swap(String[] number, int i, int j) {
			String temp;
			temp = number[i];
			number[i] = number[j];
			number[j] = temp;
	
		}
		public static void swap(ItemDetail[] number, int i, int j) {
			ItemDetail temp;
			temp = number[i];
			number[i] = number[j];
			number[j] = temp;
	
		}

}
