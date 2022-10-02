package view;

import java.io.File;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

import bean.Student;
import utils.FileUtils;

public class Ex05 {
	private static String pathname = String.join(File.separator, "student.txt");

	public static void main(String[] args) {
		List<Student> students = FileUtils.readFile((new File(pathname)).toPath(), Student::transfer);
		System.out.println(students);
		// 1.Sắp xếp danh sách sinh viên tăng dần theo ĐTB. Nếu DTB bằng nhau sắp xếp
		// tăng dần theo họ tên.
		printProb1(students);
		System.out.println("==============================================");
		// 2. Viết hàm tìm kiếm danh sách sinh viên có ĐTB > 8
		printProb2(students);
		System.out.println("==============================================");
		// 3. Viết hàm tìm kiếm toàn bộ các sinh viên NỮ
		printProb3(students);
		System.out.println("==============================================");
		// 4. Tìm kiếm sinh viên chỉ xuất hiện một lần trong student.txt. Biết rằng 2 sinh viên được
		// phân biệt với nhau thông qua MSSV
		printProb4(students);

	}

	private static void printProb1(List<Student> students) {
		students.stream().sorted(Comparator.comparing(Student::getPoint).thenComparing(Student::getName))
				.forEach(System.out::println);
	}

	private static void printProb2(List<Student> students) {
		students.stream().filter(student -> student.getPoint() > 8).forEach(System.out::println);
	}

	private static void printProb3(List<Student> students) {
		students.stream().filter(student -> student.getGender().equals("Nu")).forEach(System.out::println);
	}

	private static void printProb4(List<Student> students) {
		students.stream().filter(distinctByKey(Student::getId)).forEach(System.out::println);
	}

	public static <T, R> Predicate<T> distinctByKey(Function<T, R> func) {
		Set<R> set = new HashSet<>();
		return t -> set.add(func.apply(t));
	}
}
