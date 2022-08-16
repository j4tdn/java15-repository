package model;

import bean.Student;

public class DataModel {
	private DataModel() {
	}
	
	public static Student[] getStudent(){
		return new Student[] {
				new Student (001, "Quang", 22),
				new Student (002, "Tuyen", 21),
				new Student (003, "Nam", 20),
				new Student (004, "Linh", 19),
				new Student (005, "Cam", 23),
				new Student (006, "Hai", 25),
				new Student (007, "Hoa", 18)
		};
	}
}
