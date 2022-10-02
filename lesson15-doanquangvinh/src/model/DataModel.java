package model;

import java.util.Arrays;
import java.util.List;

import common.Student;
import common.gender;

public class DataModel {
	public static List<Student> getStudents() {
		return Arrays.asList(new Student(102130174, "Le Na", 7.8, gender.Nu),
				new Student(102130125, "Hoang Nam", 8.2, gender.Nam),
				new Student(102130176, "Van Cuong", 9.8, gender.Nam),
				new Student(102130177, "Van Cong", 6.8, gender.Nu), new Student(102130178, "Ngoc Nu", 9.1, gender.Nu),
				new Student(102130180, "Hoang Nhung", 7.8, gender.Nu));
	}
}
