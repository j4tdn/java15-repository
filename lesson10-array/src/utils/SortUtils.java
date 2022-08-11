package utils;

public class SortUtils {
	private SortUtils() {
		
	}
	public static void swap(int[] source, int a, int b)
	{
		int temp = source[a];
		source[a] = source[b];
		source[b] = temp;
	}
}
