package utils;

import bean.Student;

public class Swap {
	public Swap() {
	}

	public static void swap(int[] source, int i, int j) {
		int tmp = source[i];
		source[i] = source[j];
		source[j] = tmp;
	}

	public static void swap(String[] source, int i, int j) {
		String tmp = source[i];
		source[i] = source[j];
		source[j] = tmp;
	}

	public static void swap(Student[] source, int i, int j) {
		Student tmp = source[i];
		source[i] = source[j];
		source[j] = tmp;
	}
}
