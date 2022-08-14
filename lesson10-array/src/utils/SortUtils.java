package utils;

import bean.ItemDetail;

public class SortUtils {
	private SortUtils() {
		
	}
	public static void swap(int[] source, int a, int b)
	{
		int temp = source[a];
		source[a] = source[b];
		source[b] = temp;
	}
	public static void swap(String[] source, int a, int b)
	{
		String temp = source[a];
		source[a] = source[b];
		source[b] = temp;
	}
	public static void swap(ItemDetail[] source, int a, int b)
	{
		ItemDetail temp = source[a];
		source[a] = source[b];
		source[b] = temp;
	}
}
