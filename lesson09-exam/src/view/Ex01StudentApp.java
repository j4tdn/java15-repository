package view;

import java.util.Arrays;

import bean.Student;
import common.Rank;

public class Ex01StudentApp {
	public static void main(String[] args) {
		Student[] students = findAll();

		Student[] studentsByRank = findStudent(students, Rank.A);
		System.out.println(Arrays.toString(studentsByRank));
		System.out.println(Arrays.toString(findResignesStudent(students)));
	}

	// Tìm danh sách sinh viên đã tham gia học lại môn cấu trúc dữ liệu trong năm
	// 2021.
	private static Student[] findResignesStudent(Student[] students) {

		Student[] result = new Student[students.length];
		int count = 0;
		boolean[] resignedFlags = new boolean[students.length];

		for (int i = 0; i < students.length - 1; i++) {
			if (!resignedFlags[i]) {
				for (int j = i + 1; j < students.length; j++) {
					if(!resignedFlags[j] && students[i].equals(students[j])) {
						resignedFlags[i] = true;
						resignedFlags[j] = true;
						
					}
				}
			}
		}
		for (int i = 0; i < resignedFlags.length; i++) {
			if(resignedFlags[i]) {
				result[count++] = students[i];
			}
		}
		return Arrays.copyOfRange(result, 0, count);

	}

	private static Student[] findStudent(Student[] students, Rank rankFilter) {
		Student[] result = new Student[students.length];
		int count = 0;

		for (Student student : students) {
			if (rankFilter.equals(student.getRank())) {
				result[count++] = student;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

	private static Student[] findAll() {
		return new Student[] { new Student(102, "Nam", Rank.C),
				new Student(103, "Bảo", Rank.F),
				new Student(104, "Hoàng", Rank.D),
				new Student(105, "Nguyên", Rank.B),
				new Student(107, "Vũ", Rank.F),
				new Student(109, "Lan", Rank.A),
				new Student(202, "Đạt", Rank.C),
				new Student(103, "Bảo", Rank.F),
				new Student(107, "Vũ", Rank.C),
				new Student(104, "Hoàng", Rank.B) };
	}
}
