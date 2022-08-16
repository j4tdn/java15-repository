package ex04.sorting;

import java.util.Comparator;

import ex04.bean.Student;
import ex04.utils.SortUtils;

public class SelectionSort {
	private static void sort(Student[] source, Comparator<Student> helper) {
		for (int i = 0; i < source.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < source.length; j++) {
				if (helper.compare(source[minIndex], source[j]) > 0) {
					SortUtils.swap(source, minIndex, j);
				}
			}
		}
	}
}
