package view;

import static java.util.Comparator.comparing;
import static java.util.Comparator.nullsFirst;
import static java.util.Comparator.reverseOrder;

import java.util.Arrays;

import bean.Student;
import model.DataModel;
import static sorting.Sorting.*;


public class Ex04 {
	public static void main(String[] args) {
		int arr[] = { 1,5,4,7,3,98,34,967,23,1};	
		bubleSort(arr, (int a, int b) -> (a -  b));
		System.out.println("bubblesort: " + Arrays.toString(arr));
		System.out.println("=================================");
		
		int arr2[] = { 1,5,4,7,3,98,34,967,23,1};	
		selectionSort(arr2, (int a, int b) -> (a - b));
		System.out.println("Selectionsort: " + Arrays.toString(arr2));
		System.out.println("=================================");
		
		int arr3[] = { 1,5,4,7,3,98,34,967,23,1};	
		insertionSort(arr3, (int a, int b) -> (a - b));
		System.out.println("Insertionsort: " + Arrays.toString(arr3));
		System.out.println("=================================");
		
		Student[] std = DataModel.getStudent();
		bubbleSortWithStudent(std, (Student s1, Student s2) -> {
				if(s1 == null) return -1;
				if(s2 == null) return 1;
				int sid1 = s1.getId();
				int sid2 = s2.getId();
				if(sid1 != sid2) {
					return sid1 - sid2;
				}
				int sage1 = s1.getAge();
				int sage2 = s2.getAge();
				return sage1 - sage2;
				
		});
		System.out.println("Objectsort: " + Arrays.toString(std));
		System.out.println("===============");

		Student[] stds = DataModel.getStudent();
		System.out.print("Tăng dần: "); sortASC(stds) ;
		System.out.println("===============");
		System.out.print("Giảm dần: "); sortDESC(stds) ;
	
	}
	private static void sortASC(Student[] stds) {
		Arrays.sort(stds, nullsFirst(
				comparing(Student::getId).thenComparing(Student::getAge)));
		System.out.println(Arrays.toString(stds));
	}
	private static void sortDESC(Student[] stds) {
		Arrays.sort(stds, nullsFirst(
				comparing(Student::getId, reverseOrder()).thenComparing(Student::getAge, reverseOrder())));
		System.out.println(Arrays.toString(stds));
	}
	
}
