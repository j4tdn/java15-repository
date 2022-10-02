package view;

import java.io.File;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import bean.Student;
import utils.FileUtils;

public class Ex05 {
	private static String pathname = String.join(File.separator, "data", "student.txt");
	public static void main(String[] args) {
		// read data from file
		Path path = FileUtils.createFileAsPath(pathname);
		System.out.println("---- Read File----");
		List<String> lines = FileUtils.readFile(path);
		List<Student> students = FileUtils.readFileCase1(path, Student::transfer);
		students.forEach(System.out::println);
		 //1
		System.out.println("prob1");
		
		students.stream().sorted(Comparator.comparing(Student::getPoint))
						.forEach(System.out::println);
			
		//2
		System.out.println("prob2");
		students.stream().filter(e->e.getPoint()>8)
						.forEach(System.out::println);
		
		//3
		System.out.println("prob3");
		students.stream().filter(e->e.getGenfer().equals("Nu"))
						 .map(Student::getName)
						 .forEach(System.out::println);
		//4
		System.out.println("prob4");
		//List<Student> stu=
				students.stream()	
						.map(Student::getId)
						.distinct()
						.forEach(System.out::println);
					
		
		
		
				
		
		
		
		
	}
}
