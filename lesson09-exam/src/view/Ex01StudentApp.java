package view;

import java.util.Arrays;
import java.util.Iterator;

import bean.Student;
import common.Rank;

public class Ex01StudentApp {
	public static void main(String[] args) {
		Student[] students = findAll();

		Student[] studentsByRank = findStudents(students, Rank.A);
		System.out.println(Arrays.toString(studentsByRank));
		Student[] resignedStudents = findResignedStudents(students);
		System.out.println(Arrays.toString(resignedStudents));
	}

	// Tim danh sach sinh vien da tham gia hoc lai mon trong nam 2021
	private static Student[] findResignedStudents(Student[] students) {
		Student[] result = new Student[students.length];
		int running = 0;
		boolean[] resignedFlags = new boolean[students.length];
		for (int i = 0; i < students.length - 1; i++) {
			if (!resignedFlags[i]) {
				for (int j = i + 1; j < students.length; j++) {
					if (!resignedFlags[j] && students[i].equals(students[j])) {
						resignedFlags[i] = true;
						resignedFlags[j] = true;
					}
				}
			}
			for (int j = 0; j < resignedFlags.length; j++) {

			}
		}
		for (int i = 0; i < resignedFlags.length; i++) {
			if (resignedFlags[i] && !contains(result, running, students[i])) {
				result[running++] = students[i];
			}
		}
		return Arrays.copyOfRange(result, 0, running);
	}

	private static boolean contains(Student[] elements, int nonNullElements, Student student) {
		for (int i = 0; i < nonNullElements; i++) {
			if (elements[i].equals(student)) {
				return true;
			}
		}
		return false;
	}

	// Tim danh sach sinh vien tung dat loai A trong nam 2021
	private static Student[] findStudents(Student[] students, Rank filterRank) {
		// B1 : Tao mang tra ve , do dai = do dai cua mang input
		Student[] results = new Student[students.length];
		// B2 : Tao bien dem - so luong phan tu can lay
		int running = 0;
		for (int i = 0; i < results.length; i++) {
			if (filterRank.equals(students[i].getRank())) {
				results[running++] = students[i];
			}

		}
		// B3 : Duyet mang input . Neu phan tu nao thoai man thi dua vao mang result
		return Arrays.copyOfRange(results, 0, running);
	}

	private static Student[] findAll() {
		return new Student[] { new Student(102, "Nam", Rank.C), new Student(103, "Bao", Rank.F),
				new Student(104, "Hoang", Rank.D), new Student(105, "Nguyen", Rank.B), new Student(107, "Vu", Rank.F),
				new Student(109, "Lan", Rank.A), new Student(202, "Dat", Rank.C), new Student(103, "Bao", Rank.F),
				new Student(107, "Vu", Rank.C), new Student(104, "Hoang", Rank.B) };
	}
}
