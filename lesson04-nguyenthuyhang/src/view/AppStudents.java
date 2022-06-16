package view;

import java.util.Scanner;

import bean.Student;

public class AppStudents {
	public static void main(String[] args) {
		Student sv1 = new Student(1, "Nguyen Thuy Hang", 9.6f, 9f);
		System.out.println(sv1);
		System.out.println("==============");
		
		Student sv2 = new Student(2, "Nguyen Khanh Vy", 10f, 9f);
		System.out.println(sv2);
		System.out.println("==============");
		
		Student sv3 = new Student();
		System.out.println("Enter student information");
		inputInformation(sv3);
		
		System.out.println("================");
		Student[] sv = {sv1,sv2,sv3};
		System.out.println("Students with GPA greater than 8.5: ");
		averagePoint(sv);
		
		System.out.println("================");
		System.out.println("Student with point LT better than point TH:");
		comparePoint(sv);
	}
	
	public static void inputInformation(Student sv3) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter student ID: ");	
		sv3.setId(ip.nextInt());
		System.out.println("Enter student name: ");
		sv3.setName(ip.nextLine());
		System.out.println("Enter point LT: ");
		sv3.setPointLT(ip.nextFloat());
		System.out.println("Enter point TH: ");
		sv3.setPointTH(ip.nextFloat());
		
	}
	public static void averagePoint(Student[]sv) {
		for(Student student:sv) {
			if (student.averagePoint() > 8.5) {
				System.out.println(sv);
			}
		}
	}
	public static void comparePoint(Student[]sv) {
		for(Student student: sv) {
			if(student.getPointLT() > student.getPointTH()) {
				System.out.println(sv);
			}
		}
	}
}
