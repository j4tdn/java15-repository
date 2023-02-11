package view;

import java.util.List;

import persistence.Student;
import service.StudentService;
import service.StudentServiceImpl;

public class StudentView {
	private static StudentService studentService;
	
	static {
		studentService = new StudentServiceImpl();
	}
	
	public static void main(String[] args) {
		System.out.println("Câu 1: List all student by class id");
		List<Student> students = studentService.getAll();
		students.forEach(System.out::println);
		
	
	}
}
