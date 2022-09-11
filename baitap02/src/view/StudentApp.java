package view;

import bean.Student;
import static utils.StudentUtil.*;

public class StudentApp {
	public static void main(String[] args) {
		Student[] students = getStudent();
		
		printStudent(students);
		
		System.out.println("amount of rank A Student : " +getRankAStudent(students));
		
		Student[] studentOver20 = getStudentOver20(students);
		System.out.println("==================");
		for (Student student : studentOver20) {
			System.out.println(student);
		}
		
	}
}
