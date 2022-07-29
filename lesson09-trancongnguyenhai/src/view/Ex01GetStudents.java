package view;

import bean.Student;

import java.util.Arrays;

import bean.Ranking;

public class Ex01GetStudents {
	public static void main(String[] args) {
		Student s1 = new Student(102, "Nam", Ranking.C);
		Student s2 = new Student(103, "Bảo", Ranking.F);
		Student s3 = new Student(104, "Hoàng", Ranking.D);
		Student s4 = new Student(105, "Nguyên", Ranking.B);
		Student s5 = new Student(107, "Vũ", Ranking.F);
		Student s6 = new Student(109, "Lan", Ranking.A);
		Student s7 = new Student(202, "Đạt", Ranking.C);
		Student s8 = new Student(103, "Bảo", Ranking.F);
		Student s9 = new Student(107, "Vũ", Ranking.C);
		Student s10 = new Student(104, "Hoàng", Ranking.B);
		Student[] students = { s1, s2, s3, s4, s5, s6, s7, s8, s9, s10 };
		System.out.print("Student get A: ");
		Student[] lisStudentsRankingA = findStudentRankingA(students);
		for(Student student: lisStudentsRankingA) {
			System.out.println(student);
		}
		System.out.println("============================");
		System.out.print("Student must learn again: ");
		Student[] listStudentsLearned = findStudentLearned(students);
		for(Student student: listStudentsLearned) {
			System.out.println(student);
		}
	}

	private static Student[] findStudentRankingA(Student[] students) {
		Student[] listStudentRankingA = new Student[students.length];
		int rid = 0;
		for (Student student : students) {
			if (student.getRank() == Ranking.A) {
				listStudentRankingA[rid++] = student;
			}
		}
		return Arrays.copyOfRange(listStudentRankingA, 0, rid);
	}
	
	private static Student[] findStudentLearned(Student[] students) {
		Student[] listStudentLearned = new Student[students.length];
		int rid = 0;
		for (Student student : students) {
			if (student.getRank() == Ranking.F) {
				listStudentLearned[rid++] = student;
			}
		}
		return Arrays.copyOfRange(listStudentLearned, 0, rid);
	}
}
