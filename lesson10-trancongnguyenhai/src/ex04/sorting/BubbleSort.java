package ex04.sorting;

import java.util.Comparator;

import ex04.bean.Student;
import ex04.utils.SortUtils;

public class BubbleSort {
	public static void sort(Student[] students, Comparator<Student> helper) {
		for (int round = 0; round < students.length; round++) {
			for (int i = 0; i < students.length - round - 1; i++) {
				if(helper.compare(students[i], students[i+1]) > 0) {
					SortUtils.swap(students, i, i+1);
				}
			}
		}
	}
}
