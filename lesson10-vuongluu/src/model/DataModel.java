package model;

import bean.Student;

public class DataModel {
	private DataModel() {

	}
	public static Student[] getStudents() {
		return new Student[] {
				new Student(1, "nguyen A", 10),
				new Student(2, "tran B", 9),
				new Student(3, "hoang C", 20),
				new Student(4, "phan D", 18),
				new Student(5, "truong E", 1),
		};
	}
}
