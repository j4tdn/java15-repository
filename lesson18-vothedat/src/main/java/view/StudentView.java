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
		System.out.println("1. List all student by class id");
	    List<Student> students = studentService.getAll();
	    for(Student student: students) {
	    	System.out.println(student);
	    }
	}
	
}
