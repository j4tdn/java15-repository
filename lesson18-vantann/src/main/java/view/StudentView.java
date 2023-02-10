package view;

import service.StudentService;
import service.StudentServiceImpl;

public class StudentView {
	private static StudentService studentService;
	
	static {
		studentService = new StudentServiceImpl();
	}
	
	public static void main(String[] args) {
		//1
		studentService.getStudentById(2).forEach(System.out::println);
		
		//2
		studentService.getGoodStudents().forEach(System.out::println);
	}
}
