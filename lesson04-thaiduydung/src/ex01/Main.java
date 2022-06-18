package ex01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Student stu1 = new Student(1, "Nguyen Van A", 8.25, 6.5);
		Student stu2 = new Student(2, "Nguyen Van B", 7.0, 8.5);
		Student stu3 = new Student();

		Scanner console = new Scanner(System.in);
		System.out.println("Sinh viên 03");
		System.out.print("ID: ");
		stu3.setID(Integer.parseInt(console.next()));
		System.out.print("Full name: ");
		stu3.setFullname(console.next());
		System.out.print("Theoretical Score: ");
		stu3.setTheoreticalScore(Double.parseDouble(console.next()));
		System.out.print("Practical Score: ");
		stu3.setPracticalScore(Double.parseDouble(console.next()));

		Student[] arr = { stu1, stu2, stu3 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}