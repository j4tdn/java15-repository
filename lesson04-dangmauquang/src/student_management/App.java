package student_management;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Student sv1 = new Student(1, "Dang Mau Quang", 8, 10);
		Student sv2 = new Student(2, "Nguyen Thanh Nam", 9, 7);
		Student sv3 = new Student();
		
//		Scanner sc = new Scanner(System.in);
//		sv3.setName(sc.nextLine());
//		sv3.setTheoryScores(sc.nextFloat());
//		sv3.setPracticeScores(sc.nextFloat());
//				
		
		Student[] students = {sv1, sv2, sv3};
		findStudentByAverageScore(students);
		System.out.println("=============================================================================");
		findStudentByTheoryScores(students);
		
	}
	
	
	public static void findStudentByAverageScore (Student[] students) {
		for(Student student: students) {
			if(student.averageScore() > 8.5) {
				System.out.println(student);
			}
		}
	}
	
	public static void findStudentByTheoryScores (Student[] students) {
		for(Student student: students) {
			if(student.getTheoryScores() > student.getPracticeScores()) {
				System.out.println(student);
			}
		}
	}
}
