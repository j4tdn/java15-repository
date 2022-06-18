package ex1.utils;
import java.util.Scanner;

import ex1.bean.Student;
public class StudentUtils {
	private StudentUtils() {
		
	}
	
	public static Student inputData() {
		Student sv = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("Input id: ");
		sv.setId(Integer.parseInt(sc.nextLine()));
		System.out.println("Input name: ");
		sv.setName(sc.nextLine());
		System.out.println("Input theory mark: ");
		sv.setTheoryMark(Float.parseFloat(sc.nextLine()));
		System.out.println("Input practice mark: ");
		sv.setPracticeMark(Float.parseFloat(sc.nextLine()));
		return sv;
	}
	
	public static String findHighestAverage(Student[] students) {
		Student maxAverageStudent = null;
		for(Student student : students) {
			if(student.getAverage() > 8.5) {
				maxAverageStudent = student;
			}
		}
		
		String result = maxAverageStudent == null ? "There is not student has average above 8.5" : maxAverageStudent.toString();
		return result;
	}
	
	public static Student[] findTheoryHigh(Student[] students) {
		Student[] theoryHighStudents = new Student[students.length];
		int index = 0;
		for(Student student : students) {
			if(student.getTheoryMark() > student.getPracticeMark()) {
				theoryHighStudents[index] = student;
				index++;
			}
		}
		return theoryHighStudents;
		
	}
}
