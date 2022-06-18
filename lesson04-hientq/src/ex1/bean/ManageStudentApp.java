package ex1.bean;
import java.util.Scanner;

import ex1.utils.StudentUtils;
public class ManageStudentApp {
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Student sv1 = new Student(1, "Hien Quang Tran", 4.6f, 7.7f);
		Student sv2 = new Student(2, "Dung Doan", 9.6f, 8.7f);
		
		Student sv3 = StudentUtils.inputData();
		
		Student[] listStudent = {sv1 , sv2, sv3};
		System.out.println("The student has highest average is: ");
		System.out.println(StudentUtils.findHighestAverage(listStudent));
		System.out.println("The students has theory mark is higher than practice mark: ");
		for(Student student : StudentUtils.findTheoryHigh(listStudent)) {
			if(student == null) {
				continue;
			}
			System.out.println(student);
		}
		
	}
}
