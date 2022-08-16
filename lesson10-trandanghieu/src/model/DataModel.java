package model;

import bean.ItemDetail;
import bean.Student;

public class DataModel {
	private DataModel() {

	}

	public static Student[] getStudent() {
		return new Student[] { 
				new Student(2,"Jack",11),
				new Student(1,"John",18),
				new Student(5,"Linda",19),
				new Student(6,"Tom",21),
				new Student(4,"Capenter",31),
				new Student(3,"Luiz",15),
				new Student(10,"Liz",14),
				new Student(9,"Eden",15),
				new Student(7,"Dani",13),
				new Student(8,"Ballack",12),

		};
	}
}

