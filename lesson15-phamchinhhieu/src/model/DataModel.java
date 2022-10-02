package model;

import java.util.Arrays;
import java.util.List;

import ex05.Student;

public class DataModel {
	public DataModel() {
		// TODO Auto-generated constructor stub
	}

	public static List<Student> getStudents() {
		return Arrays.asList(new Student("102130174", "Le Na", 7.8, "Nu"),
				new Student("102130125", "Hoang Nam", 8.2, "Nam"),
				new Student("102130176", "Van Cuong", 9.8, "Nam"),
				new Student("102130177", "Van Cong", 6.8, "Nam"),
				new Student("102130178", "Ngoc Nu", 9.1, "Nu"),
				new Student("102130178", "Ngoc Nu", 9.1, "Nu"),
				new Student("102130180", "Hoang Nhung", 7.8, "Nu")

		);
	}
}
