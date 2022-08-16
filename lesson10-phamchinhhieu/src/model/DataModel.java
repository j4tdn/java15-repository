package model;

import bean.Student;

public class DataModel {
	public DataModel() {
		// TODO Auto-generated constructor stub
	}

	public static Student[] getStudent() {
		return new Student[]
				{
			new Student(101,"SV1", 18),
			new Student(105,"SV5", 19),
			new Student(107,"SV7", 18),
			new Student(104,"SV4", 22),
			new Student(107,"SV2", 24),
			new Student(106,"SV6", 21),
			new Student(103,"SV3", 20),
			new Student(108,"SV8", 25)};
		
	}
}