package utils;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

import bean.Student;
import common.Gender;
import common.Rank;

public class StudentUtil {
	private StudentUtil() {
		
	}
	public static Student[] getStudent() {
		return new Student[] {new Student(111, "Nam", Gender.male, LocalDate.of(1990, 1, 1), "111A", 7.0),
							new Student(112, "Mabu", Gender.female, LocalDate.of(2000, 2, 2), "111B", 9.0),
							new Student(113, "Bulo", Gender.male, LocalDate.of(2001, 12, 1), "111C", 5.7),
							new Student(114, "GamBin", Gender.other, LocalDate.of(1996, 1, 12), "111D", 6.7),
							new Student(115, "NaoKo", Gender.female, LocalDate.of(1997, 12, 31), "111E", 7.8)};
	}
	public static void printStudent(Student[] students) {
		for (Student student : students) {
			System.out.println(student);
		}
	}
	public static int getRankAStudent(Student[] students) {
		int result = 0;
		for (Student student : students) {
			if(student.setRank().equals(Rank.C)) {
				result++;
			}
		}
		return result;
	}
	public static Student[] getStudentOver20(Student[] students) {
		LocalDate now = LocalDate.now();
		Student[] result = new Student[students.length];
		int count = 0;
		for (Student student : students) {
			Period period = Period.between(student.getBirthDate(), now);
			if(period.getYears() >= 25) {
				result[count++] = student;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
}
