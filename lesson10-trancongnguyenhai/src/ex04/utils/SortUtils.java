package ex04.utils;

import ex04.bean.Student;

public class SortUtils {
	public static void swap(Student[] source, int a, int b) {
		Student temp = source[a];
		source[a] = source[b];
		source[b] = temp;
	}
}
