package ex01;

import java.util.Arrays;

public class StudentsApp {
	
	public static void main(String[] args) {
		Type A = Type.A; 
		Type B = Type.B; 
		Type C = Type.C; 
		Type D = Type.D; 
		Type F = Type.F; 
		Student[] students = 
		{
		new Student(102, "Nam", C),
		new Student(103, "Bảo", F),
		new Student(104, "Hoàng", D),
		new Student(105, "Nguyên", B),
		new Student(107, "Vũ", F),
		new Student(109, "Lan", A),
		new Student(202, "Đạt", C),
		new Student(103, "Bảo", F),
		new Student(107, "Vũ", C),
		new Student(104, "Hoàng", B)
		}; 
		Student[] list = getStudents(students,A);
		System.out.println("Danh sách học sinh được điểm A:");
		for(int i = 0; i<list.length;i++) System.out.println(list[i]);
		Student[] typeF = getStudents(students,F);
		System.out.println("Danh sách học sinh học lại:");
		for(int i = 0; i<typeF.length;i++) System.out.println(typeF[i]);
		
		
		
	}
	
	private static Student[] getStudents(Student[] students, Type text) {
		Type Kind = text;
		Student[] list = new Student[students.length];
		int count = 0;
		for(int i=0;i<students.length;i++) {
			if(students[i].type == Kind ) {
				list[count++] = students[i];
			}
		}
		return Arrays.copyOfRange(list, 0, count);
	}
	
	
}
