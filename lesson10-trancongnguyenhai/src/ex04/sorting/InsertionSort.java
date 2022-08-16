package ex04.sorting;

import java.util.Comparator;

import ex04.bean.Student;
import ex04.utils.SortUtils;

public class InsertionSort {
	public static void sort(Student[] source, Comparator<Student> helper) {
		for (int i = 1; i < source.length; i++) {
			for (int j = 0; j < i; j++) {
				if (helper.compare(source[i], source[j]) > 0) {
					SortUtils.swap(source, i, j);
				}
			}
		}
	}
}
