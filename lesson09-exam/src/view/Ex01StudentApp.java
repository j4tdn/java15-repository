package view;
/*
	Bài 1: Trong năm 2021 có N sinh viên khoa CNTT đăng ký học phần cấu trúc dữ liệu. Thông
	tin mỗi sinh viên được lưu trữ tại hệ thống gồm: Mã sinh viên, Họ tên, Xếp loại
	Xếp loại học lực được lưu trong Enum với các giá trị: A, B, C, D, E, F
	- Tìm danh sách sinh viên từng đạt loại A trong năm 2021.
	- Tìm danh sách sinh viên đã tham gia học lại môn cấu trúc dữ liệu trong năm 2021.
*/

import java.util.Arrays;
import bean.Student;
import common.Rank;

public class Ex01StudentApp {
	public static void main(String[] args) {
		Student[] students = findAll();
		Student[] studentsByRank = findStudents(students, Rank.A);
		Student[] studentsStudyAgain = getStudentsToStudyAgain(students);
		
		System.out.println(Arrays.toString(studentsByRank));
		System.out.println("===========================================");
		System.out.println(Arrays.toString(studentsStudyAgain));
	}
	
	private static Student[] findStudents(Student[] students, Rank rankFilter) {
		// B1: Tạo mảng result, độ dài = độ dài của mảng input
		Student[] result = new Student[students.length];
		
		// B2: Tạo biến đếm - số lượng phần tử cần lấy
		int running = 0;
		
		// B3: Duyệt mảng input. Nếu phần tử nào thỏa mãn thì đưa vào mảng result

		for (Student student : students) {
			if (student.getRank() == Rank.A) {
				result[running++] = student;
			}
		}

		return Arrays.copyOfRange(result, 0, running);

	}
	
	public static Student[] getStudentsToStudyAgain(Student[] students) {
		boolean[] resignedFlag = new boolean[students.length];
		Student[] result = new Student[students.length];
		int count = 0;
		
		for (int i = 0; i < students.length; i++) {
			if (!resignedFlag[i]) {
				for (int j = i + 1; j < students.length; j++) {
					if (!resignedFlag[j] && students[i].getStudentId() == students[j].getStudentId()) {
						resignedFlag[i] = true;
						resignedFlag[j] = true;
					}
				}
			}
		}

		for (int k = 0; k < resignedFlag.length; k++) {
			if (resignedFlag[k] && !contains(result, count, students[k])) {
				result[count++] = students[k];
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

	private static boolean contains(Student[] element, int notNullElements, Student student) {
		for(int i = 0; i < notNullElements; i++) {
			if(element[i].equals(student)) {
				return true;
			}
		}
		return false;
	}
	
	private static Student[] findAll() {
		return new Student[] {
					new Student(102, "Nam", Rank.C),
					new Student(103, "Bảo", Rank.F),
					new Student(104, "Hoàng", Rank.D),
					new Student(105, "Nguyên", Rank.B),
					new Student(107, "Vũ", Rank.F),
					new Student(109, "Lan", Rank.A),
					new Student(202, "Đạt", Rank.C),
					new Student(103, "Bảo", Rank.F),
					new Student(107, "Vũ", Rank.C),
					new Student(104, "Hoàng", Rank.B)
		};
	}
}