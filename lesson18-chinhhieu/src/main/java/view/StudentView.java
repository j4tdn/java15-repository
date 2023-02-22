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
		System.out.println("\n\n");
		System.out.println("Câu 2: Liệt kê tất cả các sinh viên theo môn học và điểm");
		List<StudentDto> studentforSubject = studentService.getSudentForSubject();
		printf(studentforSubject);
		System.out.println("\n\n");

		System.out.println("Câu 3: Liệt kê tất cả các sinh viên theo lớp học");
		List<StudentDto> studentPerClass = studentService.getStudenPerClass();
		printf(studentPerClass);
		System.out.println("\n\n");

		System.out.println("Câu 4: Điểm trung bình");
		List<Student> studentForAvgPoint = studentService.getStudentForAvgPoint();
		printf(studentForAvgPoint);
		System.out.println("\n\n");

		
		System.out.println("Câu 5: Điểm trung bình cao nhất của mỗi lớp");
		List<Student> studentForMaxAvgPoint = studentService.getStudentForMaxAvgPoint();
		printf(studentForMaxAvgPoint);
		
		
		
	}
	private static <E> void printf(Collection<E> collection) {
		collection.forEach(System.out::println);
	}
}