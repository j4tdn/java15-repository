package sorting;

import Common.CompareIntHelper;
import Common.CompareObjectHelper;
import bean.Student;

public class Sorting {
	public static void swap(int[] number, int i, int j) {
		int temp;
		temp = number[i];
		number[i] = number[j];
		number[j] = temp;

	}
	public static void swap(Student [] arr , int before, int after) {
		Student temp = arr[before];
		arr[before] = arr[after];
		arr[after] = temp;
	}

	public static void bubleSort(int[] arr, CompareIntHelper helper) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (helper.compare(arr[j], arr[j + 1]) > 0) {
					swap(arr, j, j + 1);
				}
			}
		}
	}

	public static void selectionSort(int[] arr, CompareIntHelper helper) {
		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (helper.compare(arr[j], arr[i]) > 0) {
					swap(arr, i, j);
				}
			}
		}
	}

	public static void insertionSort(int[] arr, CompareIntHelper helper) {
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			int j = i - 1;
			while (j >= 0 && (helper.compare(arr[j], temp) > 0)) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
	}

	public static void bubbleSortWithStudent(Student[] arr, CompareObjectHelper helper) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (helper.compare(arr[j], arr[j + 1]) > 0) {
					swap(arr, j, j + 1);
				}
			}
		}
	}
}
