package studentManagement;

import java.util.Arrays;
import java.util.Scanner;

public class StudentManageUtils {
	private StudentManageUtils() {

	}

	public static void InputStudent(Student sv) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Fill ID of student: ");
		int id = ip.nextInt();
		sv.setId(id);
		System.out.print("Fill fullname: ");
		ip.nextLine();
		String fullName = ip.nextLine();
		sv.setFullName(fullName);
		System.out.print("Fill theory score: ");
		Float theoryScore = ip.nextFloat();
		sv.setTheoryScore(theoryScore);
		System.out.print("Fill practice score: ");
		Float practiceScore = ip.nextFloat();
		sv.setPracticeScore(practiceScore);
	}

	public static Student[] findWithAverageScoreHigherThan8dot5(Student[] svs) {
		Student[] svResult = new Student[svs.length];
		int count = 0;
		for (int i = 0; i < svs.length; i++) {
			if (Student.averageScore(svs[i]) > 8.5) {
				svResult[count++] = svs[i];
			}
		}
		return Arrays.copyOfRange(svResult, 0, count);
	}

	public static Student[] findWithTheoryScoreHigherThanPracticeScore(Student[] svs) {
		Student[] svResult = new Student[svs.length];
		int count = 0;
		for (int i = 0; i < svs.length; i++) {
			if (svs[i].getTheoryScore() > svs[i].getPracticeScore()) {
				svResult[count++] = svs[i];
			}
		}
		return Arrays.copyOfRange(svResult, 0, count);
	}
}
