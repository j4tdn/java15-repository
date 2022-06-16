package Ex01;

import java.util.Scanner;

public class StudentUtils {
	private StudentUtils() {
	}
	
	public static float getAveragePoint(Student student) {
		return (student.getPracticePoint() + student.getTheoreticalPoint()) / 2;
	}
	
	public static void getInfoStudent(Student student) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter id: ");
		int id = Integer.parseInt(input.nextLine());
		System.out.print("Enter full name: ");
		String fullName = input.nextLine();
		System.out.print("Enter theoretical point: ");
		float theoreticalPoint = input.nextFloat();
		System.out.print("Enter practice point: ");
		float practicePoint = input.nextFloat();
		input.close();
		
		student.setIdStudent(id);
		student.setFullName(fullName);
		student.setTheoreticalPoint(theoreticalPoint);
		student.setPracticePoint(practicePoint);
	}
	
	public static void AveragePoint(Student[] students) {
		System.out.println("Students with a GPA above 8.5 are: ");
		for (Student student : students) 	
			if(getAveragePoint(student) > 8.5) System.out.println(student);
	}
	
	public static void theoretialPointAbove(Student[] students) {
		System.out.println("Students whose theoretical score is greater than the practical score is");
		for (Student student : students) 
			if (student.getTheoreticalPoint() > student.getPracticePoint())
				System.out.println(student);
	}
}
