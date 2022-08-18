package utils;

public class SortUtils {
	
	private SortUtils() {
		
	}
	
	public static void swap(String[] source, int i, int j) {
		String tmp = source[i];
		source[i] = source[j];
		source[j] = tmp;
	}
}