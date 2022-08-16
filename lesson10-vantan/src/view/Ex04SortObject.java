package view;

import java.util.Arrays;
import java.util.Comparator;

import bean.Student;
import model.DataModel;

public class Ex04SortObject {
	public static void main(String[] args) {
		Student[] students = DataModel.getStudentDetail();
		//sap xep theo tuoi
		sortAge(students);
		System.out.println(Arrays.toString(students));
		System.out.println("=======================");
		//sap xep theo ten
		sortName(students);
		System.out.println(Arrays.toString(students));
		
	}
	private static void sortAge(Student[] students) {
		Arrays.sort(students, new Comparator<Student>() {

			@Override
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
