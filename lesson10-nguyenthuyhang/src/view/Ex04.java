package view;

import java.util.Arrays;
import java.util.Comparator;

import bean.Student;
import model.DataModel;

public class Ex04 {
	public static void main(String[] args) {
		int[] source = {1, 10, 20, 30, 12, 94, 23, 25, 15, 77};
		System.out.println("Bubble Sort: " + Arrays.toString(source));
		Student[] students = DataModel.getInfoStudents();
		sortAge(students);
		System.out.println(Arrays.toString(students));
		sortName(students);
		System.out.println(Arrays.toString(students));
	}
	
	private static void sortAge(Student[] students) {
		Arrays.sort(students, new Comparator<Student>() {
			
			public int compare(Student s1, Student s2) {
				return s1.getAge() - s2.getAge();
			}
		});
	}
	private static void sortName(Student[] students) {
		Arrays.sort(students, new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				return s1.getName().compareTo(s2.getName());
			}
		});
	}
}
