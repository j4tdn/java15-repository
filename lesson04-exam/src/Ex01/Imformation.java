package Ex01;
import java.util.Scanner;
public class Imformation {
	public static Student EnterImformation() {
		Scanner input = new Scanner(System.in);
		Student sv = new Student();
		System.out.println("Nhap maSV");
		sv.setMaSV(input.nextInt());
		input.nextLine();
		System.out.println("Nhap tenSV");
		sv.setTenSV(input.nextLine());
		System.out.println("Nhap diemLT");
		sv.setDiemLT(input.nextFloat());
		System.out.println("Nhap diemTH");
		sv.setDiemTH(input.nextFloat());
		System.out.println("============");
		return sv;
}
	public static void averagePointOver85(Student[] students) {
		for(Student student:students) {
			if(student.MediumScore()>8.5) {
				System.out.println(student);
			}
			else {
				System.out.println("Khong co SV nao co diem TB lon hon 8.5");
			}
		}
	}
	
	public static void theoreticalPointBetterThanPracticePoint(Student[] students) {
		for(Student student:students) {
			if(student.getDiemLT()>student.getDiemTH()) {
				System.out.println(student);
			}
			else {
				System.out.println("Khong co Sv nao co DiemLT > DiemTH");
			}
		}
	}
    
    
	
}
