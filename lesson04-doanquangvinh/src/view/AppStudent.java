package view;

import java.util.Scanner;

public class AppStudent {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		Student s1 = new Student(123, "Alex", 6.3f, 7-.5f);
		Student s2 = new Student(456, "Chloe", 9.9f, 10.0f);
		Student s3 = new Student();
		System.out.print("Enter student ID :");
		s3.setId(Integer.parseInt(ip.nextLine()));
		System.out.print("Enter name :");
		s3.setName(ip.nextLine());
		System.out.print("Enter theoretical mark :");
		s3.setTmark(ip.nextFloat());
		System.out.print("Enter practical mark :");
		s3.setPmark(ip.nextFloat());
		
	//	System.out.println(s1);
	//	System.out.println(s2);
	//	System.out.println(s3);
		System.out.println(Utils.filterMark(s2));
		System.out.println(Utils.compareMark(s3));
	}
}
