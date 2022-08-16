package ex04.model;

import ex04.bean.Student;

public class DataModel {
	public DataModel() {

	}
	
	public static Student[] getStudents() {
		return new Student[] {
			new Student(1, "Diluc", 28),	
			new Student(2, "Kokomi", 18),	
			new Student(3, "Keqing", 22),	
			new Student(4, "Ayaka", 18),	
			new Student(5, "Yelan", 30),	
			new Student(6, "Yoimiya", 17),	
			new Student(7, "Mona", 22),	
		};
	}
}
