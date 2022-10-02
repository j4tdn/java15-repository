package exercies;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import bean.Student;

public class Ex05 {
	public static void main(String[] args) {
		File file = new File("input/student.txt");
		List<Student> listStudent = readLines(Paths.get(file.getPath()), Student::transfer);
//		listStudent.forEach(System.out::println);

//		Sắp xếp danh sách sinh viên tăng dần theo ĐTB. 
//		Nếu DTB bằng nhau sắp xếp tăng dần theo họ tên.
		sortByGpa(listStudent);
		System.out.println("==================");

//		Viết hàm tìm kiếm danh sách sinh viên có ĐTB > 8
		getStudentByGpa(listStudent, 8);
		System.out.println("==================");

//		Viết hàm tìm kiếm toàn bộ các sinh viên NỮ
		getStudentByGender(listStudent, "Nu");
		System.out.println("==================");

//		Tìm kiếm sinh viên chỉ xuất hiện một lần trong student.txt.
//		Overrid method equals in class Student 
		getUniqueStudent(listStudent);
	}

	// read data from student.txt
	private static List<Student> readLines(Path path, Function<String, Student> func) {
		List<Student> result = new ArrayList<>();
		try {
			List<String> lines = Files.readAllLines(path);
			for (String line : lines) {
				Optional<Student> opt = Optional.ofNullable(func.apply(line));
				if (opt.isPresent()) {
					result.add(opt.get());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	private static void sortByGpa(List<Student> data) {
		data.stream().sorted(Comparator.comparing((Student s) -> s.getGpa()).thenComparing((Student s) -> s.getName()))
				.collect(Collectors.toList()).forEach(System.out::println);
	}

	private static void getStudentByGpa(List<Student> data, int gpa) {
		data.stream().filter(s -> s.getGpa() > gpa).collect(Collectors.toList()).forEach(System.out::println);
	}

	private static void getStudentByGender(List<Student> data, String gender) {
		data.stream().filter(s -> gender.equals(s.getGender())).collect(Collectors.toList())
				.forEach(System.out::println);
	}

	// Overrided method equals in class Student
	private static void getUniqueStudent(List<Student> data) {
		data.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
	}
}