package view;

import java.util.Arrays;
import java.util.LinkedHashSet;

import bean.Student;
import common.Rank;

public class Ex01_Students {
	public static void main(String[] args) {
		Rank[] rankAsStr = Rank.values();
		String rank = null;
		Student[] students = 
			{
				new Student(102, "Nam", rankAsStr[2]),
				new Student(103, "Bảo", rankAsStr[0]),
				new Student(104, "Hoàng", rankAsStr[1]),
				new Student(105, "Nguyên", rankAsStr[3]),
				new Student(107, "Vũ", rankAsStr[0]),
				new Student(109, "Lan", rankAsStr[4]),
				new Student(202, "Đạt", rankAsStr[2]),
				new Student(103, "Bảo", rankAsStr[0]),
				new Student(107, "Vũ", rankAsStr[2]),
				new Student(104, "Hoàng", rankAsStr[3])	
			};
		Student[] stds = findStudent(students, rankAsStr);
		System.out.println("Sinh vien tung dat loai A la: ");
		for(int i = 0; i < stds.length;i++) {
			System.out.println(stds[i]);
		}
		System.out.println("============");
		System.out.println("Sinh vien tung hoc lai la: ");

		Student[] stds1 = findStudentReStudy(students, rankAsStr);
		for(int i = 0; i < stds1.length;i++) {
			System.out.println(stds1[i]);
		}

	}
	private static Student[] findStudent(Student[] students, Rank[] rankAsStr ) {
		Student[] std = new Student[students.length];
		int count = 0;
		for(int i = 0; i < students.length; i++) {
			if(students[i].getRank() == rankAsStr[4]) {
				std[count] = students[i];
				count++;
			}
		}
		return Arrays.copyOfRange(std, 0, count);
		
	}
	private static Student[] findStudentReStudy(Student[] students, Rank[] rankAsStr ) {
		Student[] std = new Student[students.length];
		int count = 0;
		for(int i = 0; i < students.length; i++) {
			if(students[i].getRank() == rankAsStr[0]) {	
					std[count] = students[i];
					count++;
			}
		}
		return Arrays.copyOfRange(std, 0, count);
		
	}
}
