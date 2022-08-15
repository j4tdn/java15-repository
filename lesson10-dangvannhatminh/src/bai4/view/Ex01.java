package bai4.view;

import java.util.Arrays;
import java.util.Comparator;

import bai4.bean.Student;
import bai4.sorting.BubbleSort;
import bai4.sorting.InsertionSort;
import bai4.sorting.MergeSort;
import bai4.sorting.QuickSort;
import bai4.sorting.SelectionSort;

public class Ex01 {
	public static void main(String[] args) {
		Student[] source = fetchData();
//		QuickSort.sort(source, 0, source.length-1, 
//				Comparator.comparing(student -> student.getAge())
//				);
//===================================================================================
//		BubbleSort.sort(source,
//				Comparator.comparing(student -> student.getAge())
//				);
//===================================================================================
//		SelectionSort.sort(source,
//				Comparator.comparing(student -> student.getAge())
//				);
//===================================================================================
//		InsertionSort.sort(source,
//				Comparator.comparing(student -> student.getAge())
//				);
//===================================================================================
		MergeSort.sort(source, 0, source.length-1, 
				Comparator.comparing(student -> student.getAge())
		);
		System.out.println(Arrays.toString(source));
	}

	public static Student[] fetchData() {
		return new Student[] { new Student(1, "A", 18), new Student(2, "B", 15), new Student(3, "C", 16),
				new Student(4, "D", 19), new Student(5, "E", 13), new Student(6, "F", 12), new Student(7, "G", 14), };
	}
}
