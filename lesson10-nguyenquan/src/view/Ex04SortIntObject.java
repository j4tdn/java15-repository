package view;

import java.util.Arrays;
import java.util.Comparator;

import static java.util.Comparator.*;
import java.util.Random;

import bean.Student;
import model.ModelData;
import sorting.Sorting;

public class Ex04SortIntObject {
	public static void main(String[] args) {
		Random random = new Random();
		Integer [] numbers = new Integer[10];
		for(int i = 0; i< numbers.length; i++) {
			numbers[i] = random.nextInt(1, 101);
		}
		Arrays.sort(numbers, comparing(number-> number.intValue()));
		System.out.println(Arrays.toString(numbers));
		System.out.println("===============================");
		Student []students = ModelData.getStudentInformation();
		Comparator<Student> comparatorName = comparing(student->student.getName());
		Comparator<Student> comparatorId = comparing(student->student.getId());
		Sorting.selectionSort(students, comparatorId);
		System.out.println(Arrays.toString(students));
		Sorting.bubbleSort(students, comparatorName);
		System.out.println(Arrays.toString(students));
		
		
	}
	

}
