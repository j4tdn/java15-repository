package bean;

import java.util.Arrays;

import common.Classification;

public class StudentList {
	private StudentList() {		
	}
	public static Student[] getStudentA(Student[] students) {
		Student[] result = new Student[students.length];
		int count = 0;
		for (Student student : students) {
			if(student.getClassification() == Classification.A) {
				result[count++] = student;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	public static Student[] getStudentStudyAgain(Student[] students) {
		Student[] result = new Student[students.length];
		int count = 0;
		for (Student student : students) {
			if(student.getClassification() == Classification.F) {
				result[count++] = student;
			}
		}
		 return Arrays.copyOfRange(result, 0, count);
	}
}
