package ex05;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

import model.DataModel;

public class Ex05 {
	private static final String path = "student.txt";
	public static void main(String[] args) {
		File file = new File(path);
		List<Student> students = DataModel.getStudents();
		students.forEach(System.out::println);
		//1. Sắp xếp danh sách sinh viên tăng dần theo ĐTB. Nếu DTB bằng nhau sắp xếp tăng dần theo họ tên.
		System.out.println("=================");
		students.stream()
		.sorted(Comparator.comparing(Student::getGpa).thenComparing(Student::getName))
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
		//Viết hàm tìm kiếm danh sách sinh viên có ĐTB > 8
		System.out.println("=================");
		students.stream()
		.filter(gpa -> gpa.getGpa() > 8)
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
		//3. Viết hàm tìm kiếm toàn bộ các sinh viên NỮ
		System.out.println("===================");
		students.stream()
		.filter(gender -> gender.getGender().equals("Nu"))
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
		//4. Tìm kiếm sinh viên chỉ xuất hiện một lần trong student.txt. Biết rằng 2 sinh viên được phân biệt với nhau thông qua MSSV
		System.out.println("===================");
			students.stream()
			.filter(id ->
			{
				int count = 0;
				for(Student student : students) {
					if(id.getId().equals(student.getId())) {
						count++;
					}
				}
				return count == 1;
			}).collect(Collectors.toList())
			.forEach(System.out::println);
	}
	private static <E> List<E> readLines(File file, Function<String, E> function) {
		List<E> rs = new ArrayList<>();
		try {
			rs = Files.lines(Path.of(file.getPath())).map(function).filter(Objects::nonNull)
					.collect(Collectors.toList());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return rs;
	}
}
