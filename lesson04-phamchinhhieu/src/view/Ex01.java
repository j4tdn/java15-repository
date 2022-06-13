package view;

import java.util.Scanner;

import bean.Student;

public class Ex01 {
	public static void main(String[] args) {
		Student sv1 = new Student(1, "Pham Chinh Hieu", 10.0f, 10.0f);
		Student sv2 = new Student(2, "Nguyen Van A", 9.6f, 9.0f);
		Student sv3 = new Student();
	//	System.out.println(sv1);
	//	System.out.println(sv2);
		EnterInformation(sv3);
		Student[] sv = {sv1,sv2,sv3};
		System.out.println("Nhung sinh vien co diem trung binh > 8,5 la: ");
		PointAverage(sv);
		System.out.println("\n==========\n");
		System.out.println("Nhung sinh vien co diem LT > TH la: ");
		ComparePoints(sv);

		
		
	}
	private static void EnterInformation(Student sv3) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhap id sv: ");
		sv3.setId(ip.nextInt());
		sv3.getId();
		ip.nextLine();
		System.out.println("Nhap name sv: ");
		sv3.setName(ip.nextLine());
		System.out.println("Nhap diem LT sv: ");
		sv3.setPointLT(ip.nextFloat());
		sv3.getPointLT();
		ip.nextLine();
		System.out.println("Nhap diem TH sv: ");
		sv3.setPointTH(ip.nextFloat());
		sv3.getPointTH();	
	}
	private static void PointAverage(Student[] sv) {
		for(int i = 0; i < sv.length; i++) {
			if((sv[i].getPointLT() + sv[i].getPointTH()) / 2 > 8.5) {
				System.out.println(sv[i]);
			}
		}
	}
	private static void ComparePoints(Student[] sv) {
		for(int i = 0; i < sv.length; i++) {
			if(sv[i].getPointLT() > sv[i].getPointTH()) {
				System.out.println(sv[i]);
			}
		}
	}
}
