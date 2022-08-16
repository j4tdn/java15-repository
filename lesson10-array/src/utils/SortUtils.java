package utils;

import bean.ItemDetail;

public class SortUtils {
	public SortUtils() {
		// TODO Auto-generated constructor stub
	}

	public static void swap(ItemDetail[] numbers, int i, int j) {
		ItemDetail tmp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = tmp;

	}

	public static void swap(String[] numbers, int i, int j) {
		String tmp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = tmp;

	}
}
