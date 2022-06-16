package Ex01;

import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args) {

		 
	    Student sv1 = new Student(1,"Nguyen Le Dinh Hoa",9.5f,9f);
	    System.out.println(sv1);
	    
	    Student sv2 = new Student(2,"Nguyen Dinh Duy",9f,10f);
	    System.out.println(sv2);
	    
	    System.out.println("Nhap thong tin SV 3:");
	    Student sv3= new Student();
	    sv3 = Imformation.EnterImformation();
		
		Student[] students= {sv1,sv2,sv3};
		System.out.println("Sv co diem trung binh lon hon 8.5 :");
		Imformation.averagePointOver85(students);
		System.out.println("Sv cos diem LT > diem TH :");
		Imformation.theoreticalPointBetterThanPracticePoint(students);;
	}
}
