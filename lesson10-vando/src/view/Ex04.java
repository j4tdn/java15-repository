package view;

import java.util.Arrays;

import bean.Student;
import utils.CompareObjectHelper;
import utils.Swap;

public class Ex04 {
	public static void main(String[] args) {
		Student[] students = new Student[] { new Student(001, "Van", 12), new Student(002, "Tuyen", 31),
				new Student(003, "Tu", 19), new Student(004, "Kai", 21), new Student(005, "Jone", 25),
				new Student(006, "Low", 35), };

		// bubleSort
		// selectionSort
		insertionSort(students, new CompareObjectHelper() {
			// name, age asc
			@Override
			public int compare(Student s1, Student s2) {
				if (s1 == null) {
					return -1;
				}
				// s1!=null
				if (s2 == null) {
					return 1;
				}
				
				int age1 = s1.getAge();
				int age2 = s2.getAge();

				if (age1 != age2) {
					return age1 - age2;
				}

				String name1 = s1.getName();
				String name2 = s2.getName();

				return name1.compareTo(name2);
			}
		});

		System.out.println(Arrays.toString(students));
	}

	private static void bubleSort(Student[] elements, CompareObjectHelper helper) {
		for (int round = 0; round < elements.length; round++) {
			for (int i = 0; i < elements.length - round - 1; i++) {
				if (helper.compare(elements[i], elements[i + 1]) > 0) {
					Swap.swap(elements, i, i + 1);
				}
			}
		}
	}

	private static void selectionSort(Student[] elements, CompareObjectHelper helper) {
		for (int round = elements.length - 1; round > 0; round--) {
			for (int i = 0; i < round; i++) {
				if (helper.compare(elements[i], elements[round]) > 0) {
					Swap.swap(elements, i, round);
				}
			}
		}
	}

	private static void insertionSort(Student[] elements, CompareObjectHelper helper) {
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < i; j++) {
				if (helper.compare(elements[i], elements[j]) > 0) {
					Swap.swap(elements, i, j);
				}
			}
		}
	}

//	private static void mergeSort(Student[] elements, CompareObjectHelper helper) {
//		int middle = elements.length / 2;
//
//		Student L[] = new Student[middle];
//		Student R[] = new Student[elements.length - L.length];
//		for (int i = 0; i < middle; ++i)
//			L[i] = arr[l + i];
//		for (int j = 0; j < n2; ++j)
//			R[j] = arr[m + 1 + j];
//
//	}
}
