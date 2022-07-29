package ex01;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Student[] students = { new Student(102, "Nam", RankEnum.C), new Student(103, "Bảo", RankEnum.F),
				new Student(104, "Hoàng", RankEnum.D), new Student(105, "Nguyên", RankEnum.B),
				new Student(107, "Vũ", RankEnum.F), new Student(109, "Lan", RankEnum.A),
				new Student(202, "Đạt", RankEnum.C), new Student(103, "Bảo", RankEnum.F),
				new Student(107, "Vũ", RankEnum.C), new Student(104, "Hoàng", RankEnum.B) };

		Student[] studentsRankA = getStudents(students, RankEnum.A);
		Student[] studentsRankF = getStudents(students, RankEnum.F);
		System.out.println("Danh sách sinh viên đạt loại A:" );

		for (Student student : studentsRankA) {
			System.out.println(student);
		}

		System.out.println("=============================");
		System.out.println("Danh sách sinh viên đạt loại F:");

		for (Student student : studentsRankF) {
			System.out.println(student);
		}
	}

	private static Student[] getStudents(Student[] students, RankEnum rank) {
		Student[] results = new Student[10];
		int count = 0;

		for (int i = 0; i < students.length; i++) {
			if (students[i].getRank().equals(rank)) {
				results[count++] = students[i];
			}
		}

		return Arrays.copyOfRange(results, 0, count);
	}

}