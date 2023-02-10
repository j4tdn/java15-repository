package view;

import java.util.Collection;
import java.util.List;

import dto.StudentDto;
import persistence.Student;
import service.StudentService;
import service.StudentServiceImpl;

public class StudentView {
	private static StudentService studentService;

	static {
		studentService = new StudentServiceImpl();
	}

	public static void main(String[] args) {
		
		
		System.out.println("Câu 1: Liệt kê tất cả các sinh viên");
		List<Student> students = studentService.getAll();
		printf(students);
		System.out.println("Câu 2: Liệt kê tất cả các sinh viên theo môn học và điểm");
		List<StudentDto> studentforSubject = studentService.getSudentForSubject();
		printf(studentforSubject);
	}
	private static <E> void printf(Collection<E> collection) {
		collection.forEach(System.out::println);
	}
}
