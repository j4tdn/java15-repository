package view;



import java.util.Collection;

import service.StudentService;
import service.StudentServiceImpl;

public class StudentView {
	private static StudentService studentService;
	static {
		studentService = new StudentServiceImpl();
	}
	public static void main(String[] args) {
		printf(studentService.getAllStudentsWithScore());
	}
	private static <E> void printf(Collection<E> collection) {
		collection.forEach(System.out::println);
	}
}
