package Ex01;

import java.awt.Point;

public class Ex01App {
	public static void main(String[] args) {
		Student[] students = {
				new Student("102", "Nam", Point.C),
				new Student("103", "Bảo", Point.F),
				new Student("104", "Hoàng", Point.D),
				new Student("105", "Nguyên", Point.B),
				new Student("107", "Vũ", Point.F),
				new Student("109", "Lan", Point.A),
				new Student("202", "Đạt", Point.C),
				new Student("103", "Bảo", Point.F),
				new Student("107", "Vũ", Point.C),
				new Student("104", "Hoàng", Point.B)
		};
		getStudentsLevelA(students);
	}
	
	private static void getStudentsA(Student[] students) {
		for(Student student: students) {
			if(student.getLevel() == Point.A) {
				System.out.println("students who have achieved grade A : \n" + student);
			}
		}
	}
}
