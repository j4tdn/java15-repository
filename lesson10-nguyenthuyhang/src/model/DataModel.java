package model;

import bean.Student;

public class DataModel {
	private DataModel() {
		
	}
	public static Student[] getInfoStudents() {
		return new Student[] {
				new Student ("S01","Khanh Vy",18),
				new Student ("S02","Bao Han",19),
				new Student ("S03","Khanh An",20),
				new Student ("S04","Thu Huong",21),
				new Student ("S05","Hai Anh",22),
				new Student ("S016","To Nhu",23),
		};
	}
}
