package view;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
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
		// 1.
		printProb1(students);
		System.out.println("==============================================");
		// 2.
		printProb2(students);
		System.out.println("==============================================");
		// 3.
		printProb3(students);
		System.out.println("==============================================");
		// 4.
		printProb4(students);

	}

	private static void printProb1(List<Student> students) {
		students.stream().sorted(Comparator.comparing(Student::getGpa).thenComparing(Student::getName))
				.forEach(System.out::println);
	}

	private static void printProb2(List<Student> students) {
		students.stream().filter(student -> student.getGpa() > 8).forEach(System.out::println);
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
