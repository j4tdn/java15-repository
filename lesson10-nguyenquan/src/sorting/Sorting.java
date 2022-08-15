package sorting;

import java.util.Comparator;

import bean.Student;
import utils.UtilsArrays;

public class Sorting {
	private Sorting() {
		
	}
	public static Student[] bubbleSort(Student[] students, Comparator<Student> comparator){
	for(int round = 0; round <students.length;round++) {
		for(int i =0; i<students.length -1-round;i++) {
			if(comparator.compare(students[i], students[i+1])>0){
				UtilsArrays.swap(students, i , i+1);
			}
		}
	}
	return students;
		
	}
	public static Student[] selectionSort(Student[] students, Comparator<Student> comparator) {
		for(int round = students.length -1 ; round > 0; round --) {
			for(int i = 0; i<round; i++) {
				if(comparator.compare(students[i], students[i+1])>0){
					UtilsArrays.swap(students, i , i+1);
				}
				
			}
		}
		return students;
	}
	 public static Student[] insertionSort(Student[] students, Comparator<Student> comparator) {
		 for(int i = 1; i<students.length;i++) {
			 for(int j = 0; j<i; j++) {
				 if(comparator.compare(students[i], students[i+1])>0){
						UtilsArrays.swap(students, i , i+1);
					}
				 
			 }
		 }
		 return students;
	 }
}
