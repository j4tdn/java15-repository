package view;

import service.StudentService;
import service.StudentServiceImp;

public class View {
	private static StudentService studentService ;
	static {
		studentService = new StudentServiceImp();
	}
	public static void main(String[] args) {
		System.out.println("1.List all student by class id");
		studentService.getAll().forEach(System.out::println);
		System.out.println("4.Find Student who have avarege point >= 8.2");
		studentService.sortGrade().forEach(System.out::println);
	}
}
