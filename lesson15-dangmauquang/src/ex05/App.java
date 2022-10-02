package ex05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class App {
	public static void main(String[] args) {
		List<Student> students = getStudents();
		
		System.out.println("1. Sắp xếp danh sách sinh viên tăng dần theo ĐTB. Nếu DTB bằng nhau sắp xếp "
				+ "tăng dần theo họ tên.");
		List<Student> sortStudents = students.stream()
				.sorted(Comparator.comparing(Student::getDtb))
				.collect(Collectors.toList());
		System.out.println(sortStudents);
		
		
		System.out.println("2. Viết hàm tìm kiếm danh sách sinh viên có ĐTB > 8");
		List<Student> searchByDtb = students.stream()
				.filter(student -> student.getDtb() > 8)
				.collect(Collectors.toList());
		System.out.println(searchByDtb);
		
		System.out.println("3. Viết hàm tìm kiếm toàn bộ các sinh viên NỮ");
		List<Student> searchByGender = students.stream()
				.filter(student -> student.getGender() == Gender.Nu)
				.collect(Collectors.toList());
		System.out.println(searchByGender);
		
		System.out.println("4. Tìm kiếm sinh viên chỉ xuất hiện một lần trong student.txt."
				+ " Biết rằng 2 sinh viên được phân biệt với nhau thông qua MSSV");
        
		System.out.println(getUniqueStudents(sortStudents));
		
 	}
	
	private static List<Student> getUniqueStudents(List<Student> students) {
		boolean[] flags = new boolean[students.size()];
		for (int pivotIndex = 0; pivotIndex < students.size(); pivotIndex++) {
			if (flags[pivotIndex]) continue;
			for (int i = 0; i < students.size(); i++) {
				if (pivotIndex != i && students.get(pivotIndex).getStudentId() == students.get(i).getStudentId()) {
					flags[pivotIndex] = true;
					flags[i] = true;
				}
			}
		}
		List<Student> result = new ArrayList<>();
		for (int i = 0; i < flags.length; i++) {
			if (!flags[i]) {
				result.add(students.get(i));
			}
		}
		
		return result;
	}
	
	
	public static List<Student> getStudents(){
		return Arrays.asList(
				new Student(102130174, "Le Na", 7.8, Gender.Nu),	
				new Student(102130125, "Hoang Nam", 8.2, Gender.Nam),	
				new Student(102130176, "Van Cuong", 9.8, Gender.Nam),	
				new Student(102130177, "Van Cong", 6.8, Gender.Nam),	
				new Student(102130178, "Ngoc Nu", 9.1, Gender.Nu),	
				new Student(102130180, "Hoang Nhung", 7.8, Gender.Nu)	
		);
	}

}
