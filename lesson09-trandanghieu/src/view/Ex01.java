package view;

import java.util.Arrays;

import bean.*;

public class Ex01 {
	public static void main(String[] args) {
		Student s1 = new Student(102, "Nam", Type.B);
		Student s2 = new Student(103, "Bảo", Type.F);
		Student s3 = new Student(104, "Hoàng", Type.D);
		Student s4 = new Student(105, "Nguyên", Type.B);
		Student s5 = new Student(107, "Vũ", Type.F);
		Student s6 = new Student(109, "Lan", Type.A);
		Student s7 = new Student(202, "Đạt", Type.C);
		Student s8 = new Student(103, "Bảo", Type.F);
		Student s9 = new Student(107, "Vũ", Type.C);
		Student s10 = new Student(104, "Hoàng", Type.B);

		Student[] students = { s1, s2, s3, s4, s5, s6, s7, s8, s9, s10 };
		System.out.println("DANH SÁCH HỌC SINH ĐẠT ĐIỂM A");
		Student[] print1s= findTypeA(students);
		for(Student print1:print1s) {
			System.out.println(print1);
		}
		System.out.println("DANH SÁCH HỌC SINH PHẢI HỌC LẠI");
		Student[] print2s= findStudentLearnAgain(students);
		for(Student print2:print2s) {
			System.out.println(print2);
		}
	}

	private static Student[] findTypeA(Student[] students) {
		Student[] result= new Student[students.length];
		int rid=0;
		for (Student student : students) {
			if(student.getType()==Type.A) {
				result[rid++]=student;
			}
		}

		return Arrays.copyOfRange(result, 0, rid);
	}

	private static Student[] findStudentLearnAgain(Student[] students) {
		Student[] result= new Student[students.length];
		int rid=0;
		for (Student student : students) {
			if(student.getType()==Type.F) {
				result[rid++]=student;
			}
		}

		return Arrays.copyOfRange(result, 0, rid);
	}

}
