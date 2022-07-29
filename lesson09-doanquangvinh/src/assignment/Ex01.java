package assignment;

import java.util.ArrayList;

import utils.*;

public class Ex01 {
	public static void main(String[] args) {
		Student[] students = { new Student(102, "Nam", Grade.C), new Student(103, "Bao", Grade.F),
				new Student(104, "Hoang", Grade.D), new Student(105, "Nguyen", Grade.B),
				new Student(107, "Vu", Grade.F), new Student(109, "Lan", Grade.A), new Student(202, "Dat", Grade.C),
				new Student(103, "Bao", Grade.F), new Student(107, "Vu", Grade.C), new Student(104, "Hoang", Grade.B)

		};
		ArrayList<Student> listName = new ArrayList<Student>();
		for (Student student : students) {
			if (student.getGrade().equals(Grade.A)) {
				System.out.println("List Name of Student has got A mark in exam :" + student.getName());
			}
			if (student.getGrade().equals(Grade.F)) {
				listName.add(student);

			}
		}
		System.out.println("List Name of Students have to study subject again :" + listName);
	}
}
