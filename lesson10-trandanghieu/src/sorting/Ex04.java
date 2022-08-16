package sorting;

import java.util.Arrays;
import java.util.Comparator;

import com.sun.management.VMOption.Origin;

import bean.*;
import model.DataModel;
import utils.CompareIntHelper;
import utils.CompareObjectHelper;
import utils.SortUtils;

public class Ex04 {
	public static void main(String[] args) {
		int[] numbers = { 11, 5, 7, 54, 28, 9, 3, 87, 92, 32 };
		Student[] students = DataModel.getStudent();

		System.out.println("=========1.BUBBLE-SORT========");
		CompareIntHelper helperBubbleAsc = (int pre, int next) -> {
			return pre > next;
		};
		bubbleSort(numbers, helperBubbleAsc);
		System.out.println(Arrays.toString(numbers));

		System.out.println("=========2.SELECTION-SORT======");
		CompareIntHelper helperSelectionAsc = (int pre, int next) -> {
			return pre > next;
		};
		selectionSort(numbers, helperSelectionAsc);
		System.out.println(Arrays.toString(numbers));

		System.out.println("=========3.INSERTION-SORT======");
		CompareIntHelper helperInsertionAsc = (int pre, int next) -> {
			return pre > next;
		};
		selectionSort(numbers, helperInsertionAsc);
		System.out.println(Arrays.toString(numbers));
		System.out.println("=========4.OBJECT-SORT-AGE======");
		Arrays.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				return s1.getAge() - s2.getAge();
			}

		});
		System.out.println(Arrays.toString(students));
	}

	private static void bubbleSort(int[] source, CompareIntHelper helper) {
		for (int round = 0; round < source.length; round++) {
			for (int i = 0; i < source.length - round - 1; i++) {
				if (helper.compare(source[i], source[i + 1])) {
					SortUtils.swap(source, i, i + 1);
				}
			}
		}
	}

	private static void selectionSort(int[] source, CompareIntHelper helper) {
		for (int round = source.length - 1; round > 0; round--) {
			for (int i = 0; i < round; i++) {
				if (helper.compare(source[i], source[round])) {
					SortUtils.swap(source, i, round);
				}
			}
		}
	}

	private static void insertionSort(int[] source, CompareIntHelper helper) {
		for (int i = 1; i < source.length; i++) {
			for (int j = 0; j < i; j++) {
				if (helper.compare(source[i], source[j])) {
					SortUtils.swap(source, i, j);
				}
			}
		}
	}

	private static void objectSort(Student[] students, CompareObjectHelper helper) {
		Comparator<Student> comparator = new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				return s1.getAge() - s2.getAge();
			}
		};
	}

}
