package demo;

import java.util.List;

import dao.HibernateStudentDao;
import dao.StudentDao;
import persistence.Student;
import service.ClassService;
import service.ClassServiceImpl;
import service.StudentService;
import service.StudentServiceImpl;
import utils.SqlUtils;

public class App {
	private static StudentService studentService;
	private static ClassService classService;
	static {
		studentService = new StudentServiceImpl();
		classService = new ClassServiceImpl();
		
	}
	public static void main(String[] args) {
		//Ex example
		List<Student> students = studentService.getAll();
		SqlUtils.print(students);
		//Ex01:
		System.out.println(studentService.getStudentByClassId(3));
		//Ex03
		System.out.println("====================");
		System.out.println(classService.countStudentsPerClass());
		
		
	}
}
