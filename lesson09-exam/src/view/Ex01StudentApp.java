package view;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import bean.Student;
import common.Pair;
import common.Rank;

public class Ex01StudentApp {
	
	public static void main(String[] args) {
		Student[] students = findAll();
		
		Student[] studentsByRank = findStudents(students, Rank.A);
		System.out.println(Arrays.toString(studentsByRank));
		
		System.out.println("===== 1st way ========");
		
		Student[] resignedStudents = findResignedStudents(students);
		System.out.println(Arrays.toString(resignedStudents));
		
		System.out.println("======2nd way =======");
		List<Student> studentList = Arrays.asList(students);
		
		
		studentList.stream().collect(Collectors.groupingBy(student -> new Pair<>(student.getId(), student.getName()), Collectors.counting()))
			  .entrySet().stream().filter(entry -> entry.getValue() > 1).map(Entry::getKey)
			  .forEach(System.out::println);
	}
	
	// Tìm danh sách sinh viên đã tham gia học lại môn cấu trúc dữ liệu trong năm 2021.
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
		}
		for (int i = 0; i < resignedFlags.length; i++) {
			if (resignedFlags[i]  && !contains(result, running, students[i])) {
				result[running++] = students[i];
			}
		}
		return Arrays.copyOfRange(result, 0, running);
	}
	
	private static boolean contains(Student[] elements, int notNullElements, Student student) {
		for (int i = 0; i < notNullElements; i++) {
			if (elements[i].equals(student)) {
				return true;
			}
		}
		return false;
	}
	
	
	// Tìm danh sách sinh viên từng đạt loại A trong năm 2021
	private static Student[] findStudents(Student[] students, Rank rankFilter) {
		// B1: Tạo mảng result, độ dài = độ dài của mảng input
		Student[] result = new Student[students.length];
		
		// B2: Tạo biến đếm - số lượng phần tử cần lấy
		int running = 0;
		
		// B3: Duyệt mảng input. Nếu phần tử nào thoải mãn thì đưa vào mảng result
		for (Student student: students) {
			if (rankFilter.equals(student.getRank())) {
				result[running++] = student;
			}
		}
		
		// B4: return mảng mới bằng số lượng các phần tử cần lấy trong mảng result
		return Arrays.copyOfRange(result, 0, running);
	}
	
	private static Student[] findAll() {
		return new Student[]{ 
				new Student(101, "Nhung", Rank.A),
				new Student(102, "Nam", Rank.C), 
				new Student(103, "Bảo", Rank.F),
				new Student(104, "Hoàng", Rank.D), 
				new Student(105, "Nguyên", Rank.B),
				new Student(107, "Vũ", Rank.F), 
				new Student(109, "Lan", Rank.A), 
				new Student(202, "Đạt", Rank.C), 
				new Student(103, "Bảo", Rank.F), 
				new Student(107, "Vũ", Rank.C), 
				new Student(104, "Hoàng", Rank.B),
				new Student(103, "Bảo", Rank.A)
		};
		
	}
}