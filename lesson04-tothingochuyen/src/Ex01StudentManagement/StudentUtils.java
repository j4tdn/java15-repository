package Ex01StudentManagement;

import java.util.Scanner;

public class StudentUtils {
	public static Students inputInformation() {
		Scanner input = new Scanner(System.in);
		Students sv = new Students();
		System.out.print("Enter student's ID: ");
		sv.setId(Integer.parseInt(input.nextLine()));
		System.out.print("Enter student's name: ");
		sv.setName(input.nextLine());
		System.out.print("Enter student's theoretical point: ");
		sv.setTheoreticalPoint(input.nextFloat());
		System.out.print("Enter student's practice point: ");
		sv.setPracticePoint(input.nextFloat());
		System.out.println(sv);
		return sv;
	}
	
	public static void averagePointOver85(Students[] sv) {
		for(Students student:sv)
			if(student.averagePoint() > 8.5) {
				System.out.println(student);
			}
	}
	
	public static void theoreticalPointBetterThanPracticePoint(Students[] sv) {
		for(Students student:sv) {
			if(student.getTheoreticalPoint() > student.getPracticePoint()) {
				System.out.println(student);
			}
		}
	}
}
