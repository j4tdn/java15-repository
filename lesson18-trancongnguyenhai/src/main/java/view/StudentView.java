package view;

import java.util.Collection;
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
		System.out.println("-----Ex01------");
		List<Student> students = studentService.getAll(1);
		printf(students);
	}
	
	private static <E> void printf(Collection<E> collection) {
		collection.forEach(System.out::println);
	}
}
