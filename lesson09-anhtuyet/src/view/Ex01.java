package view;

import been.Students;
public class Ex01 {
	public static void main(String[] args) {
		Students[] students = {
				new Students("102", "Nam", Point.C),
				new Students("103", "Bảo", Point.F),
				new Students("104", "Hoàng", Point.D),
				new Students("105", "Nguyên", Point.B),
				new Students("107", "Vũ", Point.F),
				new Students("109", "Lan", Point.A),
				new Students("202", "Đạt", Point.C),
				new Students("103", "Bảo", Point.F),
				new Students("107", "Vũ", Point.C),
				new Students("104", "Hoàng", Point.B)
		};
			getStudentsA(students);
}
	
	private static void getStudentsA(Students[] students) {
		for(Students student: students) {
			if(student.getLevel() == Point.A) {
				System.out.println("students who have achieved grade A : \n" + student);
			}
		}
	}
}
