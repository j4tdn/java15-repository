package ex05;

import java.util.Arrays;
import static java.util.Comparator.*;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StudentApp {
	
	public static void main(String[] args) {
		List<Student> students = getStudens();
		
		
	}
	private static List<Student> getStudens(){
		return Arrays.asList(new Student(102130174, "Le Na", 7.8, Gentle.Nu),
				new Student(102130125, "Hoang Nam", 8.2, Gentle.Nam),
				new Student(102130176, "Van Cuong", 9.8, Gentle.Nam),
				new Student(102130177, "Van Cong", 6.8, Gentle.Nam),
				new Student(102130178, "Ngoc Nu", 9.1, Gentle.Nu),
				new Student(102130180, "Hoang Nhung", 7.8, Gentle.Nu));
	}
	//1. sap xep tang dan theo dtb
	
	private static List<Student> sort(List<Student> students){
	students.sort(nullsFirst(comparing(Student::getPoint)).thenComparing(Student::getName) );
	return students;
	}
	//2 tim kiem cac sinh vien co diem trung binh tren 8
	private static List<Student> greater8(List<Student> students){
	List<Student> result = students.stream().filter(student -> student.getPoint() > 8.0)
		.collect(Collectors.toList());
	return result;
	}
	//3 tim nu sinh nu
	private static List<Student> womenStudents(List<Student> students){
		List<Student> result = students.stream()
				.filter(student -> student.getGentle().equals("Nu"))
				.collect(Collectors.toList());
		return result;
	}
	//4 tim kiem sinh vien chir xuat hien 1 lan
	private static Set<Student> uniqueStudent(List<Student> students){
		Set<Student> result = students.stream().collect(Collectors.toSet());
		return result;
	}
	
}
