package view;

import java.util.Arrays;
import java.util.Scanner;

import bean.AcademicType;
import bean.Student;

public class StudentManagement {
	
public static void main(String[] args) {
	

	Student[] students = {new Student(102, "Nam", AcademicType.C),
			new Student(103, "Bảo", AcademicType.F),
			new Student(104, "Hoàng", AcademicType.D),
			new Student(105, "Nguyên", AcademicType.B),
			new Student(107, "Vũ", AcademicType.F),
			new Student(109, "Lan", AcademicType.A),
			new Student(202, "Đạt", AcademicType.C),
			new Student(103, "Bảo", AcademicType.F),
			new Student(107, "Vũ", AcademicType.C),
			new Student(104, "Hoàng", AcademicType.B)
	};
	Student[] results= getStudents(students);
	for(Student result: results) {
		System.out.println(result.toString());
	}
}
 private static Student[] getStudents(Student[] students){
	 int select = 0;
	 int rid = 0;
	 Student [] results = new Student[students.length];
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("Enter the select(1/2):");
	 select = scanner.nextInt();
	 if(select == 1) {
	 for(Student student:students) {
		 if(student.getLevel()==AcademicType.A) {
			 results[rid++]= student;
		 }
	 }
	 }
	 else {
		 
		 for(int i = 0; i<students.length;i++) {
			 for(int j = i+1; j<students.length;j++) {
				 if(students[i].getMssv()== students[j].getMssv()) {
					 results[rid++]= students[i]; 
				 }
			 }
		 }
		 
	 }
	 results = Arrays.copyOfRange(results, 0, rid);
	 return results;
	
}

}
