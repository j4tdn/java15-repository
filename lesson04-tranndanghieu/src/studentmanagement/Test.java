package studentmanagement;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Student sv1=new Student(1,"Tran Dang Hieu",8.3f,9f);
		Student sv2=new Student(2,"Chau Anh Kiet",7.3f,8f);
		Student sv3= new Student();
		System.out.println("Nhập sinh viên thứ 3:");
		Scanner input= new Scanner(System.in);
		System.out.println("Nhập ID sinh viên");
		sv3.setId(input.nextInt());
		input.nextLine();
		System.out.println("Nhập tên sinh viên");
		sv3.setName(input.nextLine());
		System.out.println("Nhập điểm lý thuyết");
		sv3.setTheoryscore(input.nextFloat());
		System.out.println("Nhập điểm thực hành");
		sv3.setPracticescore(input.nextFloat());
		System.out.println("============");
		Student[] students= {sv1,sv2,sv3};
		System.out.println("=====Sinh viên có điểm trung bình lớn hơn 8.5=======");
		FindStudentByMediumScore(students);
		System.out.println("======Sinh viên có điểm lý thuyết lớn hơn điểm thực hành======");
		FindStudentByScore(students);
	}
	public static void FindStudentByMediumScore(Student[] students) {
		for(Student student:students) {
			if(Student.MediumScore(student.getTheoryscore(), student.getPracticescore())>8.5) {
				System.out.println(student);
			}
			else {
				System.out.println("Không có sinh viên nào có điểm trung bình lớn hơn 8.5");
			}
		}
	}
	
	public static void FindStudentByScore(Student[] students) {
		for(Student student:students) {
			if(student.getTheoryscore()>student.getPracticescore()) {
				System.out.println(student);
			}
			else {
				System.out.println("Không có sinh viên nào có điểm lý thuyết lớn hơn điểm thực hành");
			}
		}
	}
	

}
