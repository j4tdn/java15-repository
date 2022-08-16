package model;

import bean.Student;

public class DataModel {
	private DataModel() {
		
	}
	public static Student[] getStudentDetail() {
		return new Student[] {
				new Student(100, "Anna", 19),
				new Student(101, "Micheal", 25),
				new Student(102, "Ander", 17),
				new Student(103, "David", 24),
				new Student(104, "Bruno", 22),
				new Student(105, "Scott", 21),
				new Student(106, "Fred", 28),
		};
	}
}
