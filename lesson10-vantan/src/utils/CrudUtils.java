package utils;

public class CrudUtils {
	private CrudUtils() {
		
	}
	public static void swap(String[] source, int i, int j) {
		String temp = source[i];
		source[i] = source[j];
		source[j] = temp;
	}
	public static void swap(int[] source, int i, int j) {
		int temp = source[i];
		source[i] = source[j];
		source[j] = temp;
	}
	
}
