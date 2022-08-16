package model;

import bean.Student;

public class DataModel {
	private DataModel() {
		
	}
	public static Student[] getStudent() {
		return new Student[] {
			new Student(100,"Tuyet",19),	
			new Student(101,"Anh",20),
			new Student(102,"Tu",21),
			new Student(103,"Hang",20),	
			new Student(104,"Loan",19),	
			new Student(105,"Duyen",18)	

		};
	}
}
