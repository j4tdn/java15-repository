package vew;

import java.util.Scanner;

import been.Student;

public class Ex01 {
	public static void main(String[] args) {
		Student s1 = new Student(1, "Le Thi Anh Tuyet", 10.0f, 10.0f);
		Student s2 = new Student(2, "Nguyen Thuy Hang", 9.0f, 9.0f);
		System.out.println(s1);
		System.out.println(s2);
		Student s3 = new Student ();
		IpInformation(s3);
		Student [] sv = {s1, s2, s3};
		System.out.println("Nhung sinh vien co diem trung binh > 8,5 la: ");
		ScoreAverage(sv);
		System.out.println("===================");
		System.out.println("Nhung sinh vien co diem LT > TH la: ");
		ComparePoints(sv);
	}
	private static void IpInformation(Student s3) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhap id sv: ");
		s3.setId(ip.nextInt());
		s3.getId();
		ip.nextLine();
		System.out.println("Nhap ten sinh vien: ");
		s3.setName(ip.nextLine());
		System.out.println("Nhap diem LT sinh vien: ");
		s3.setScoreLT(ip.nextFloat());
		s3.getScoreLT();
		ip.nextLine();
		System.out.println("nhap diem HT sinh vien: ");
		s3.setScoreTH(ip.nextFloat());
		s3.getScoreTH();
	}
	private static void ScoreAverage(Student [] sv) {
		for(int i = 0; i < sv.length; i++) {
			if(sv[i].getScoreLT() + sv[i].getScoreTH() /2 > 8.5) {
				System.out.println(sv[i]);
			}
		}
	}
	private static void ComparePoints(Student[] sv) {
		for(int i = 0; i < sv.length; i++) {
			if(sv[i].getScoreLT() > sv[i].getScoreTH() ) {
				System.out.println(sv[i]);
			}
		}
	}
}
