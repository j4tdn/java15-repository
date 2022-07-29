package view;

import bean.Student;
import bean.StudentList;
import common.Classification;

public class Ex01 {
	public static void main(String[] args) {
		Student[] students = {new Student(102, "Nam", Classification.C),
				new Student(103, "Bảo", Classification.F),
				new Student(104, "Hoàng", Classification.D),
				new Student(105, "Nguyên", Classification.B),
				new Student(107, "Vũ", Classification.F),
				new Student(109, "Lan", Classification.A),
				new Student(202, "Đạt", Classification.C),
				new Student(103, "Bảo", Classification.F),
				new Student(107, "Vũ", Classification.C),
				new Student(104, "Hoàng", Classification.B)};
		Student[] studentA = StudentList.getStudentA(students);
		for (Student student : studentA) {
			
			System.out.println(student);
		}
		Student[] studentStudyAgain = StudentList.getStudentStudyAgain(students);
		for (Student student : studentStudyAgain) {
			
			System.out.println(student);
		}
	}
	
}
