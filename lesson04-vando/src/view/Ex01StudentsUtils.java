package view;

import java.util.Scanner;

public class Ex01StudentsUtils {
	static Scanner sc = new Scanner(System.in);

	public static void inputStudent(Ex01Students sv) {
		System.out.print("Enter student's ID: ");
		sv.setId(Integer.parseInt(sc.nextLine()));

		System.out.print("Enter student's name: ");
		sv.setName(sc.nextLine());

		System.out.print("Enter student's theoretical point: ");
		sv.setPointLT(sc.nextFloat());

		System.out.print("Enter student's practice point: ");
		sv.setPointTH(sc.nextFloat());

	}

	public static void averagePointOver85(Ex01Students[] sv) {
		for (Ex01Students student : sv)
			if (student.averagePoint() > 8.5) {
				System.out.println(student);
			}
	}

	public static void PointLTBetterPointTH(Ex01Students[] sv) {
		for (Ex01Students student : sv) {
			if (student.getPointLT() > student.getPointTH()) {
				System.out.println(student);
			}
		}
	}
}
