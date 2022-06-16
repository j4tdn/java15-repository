package Ex01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Student sv1 = new Student(1, "Ho Nguyen Hoang Vy", 9, 8);
		Student sv2 = new Student(2, "Nguyen Doan Dung", 10, 10);
		Student sv3 = new Student();
		Student[] students = { sv1, sv2, sv3 };
		StudentUtils.getInfoStudent(sv3);
		StudentUtils.AveragePoint(students);
		StudentUtils.theoretialPointAbove(students);
	}
}