package Ex01;

import java.util.Scanner;

public class Gpa {
	private static double Gpa(Students student) {
		double Gpa;
		return Gpa = student.getPointlt() * 0.4 + student.getPointth() * 0.6;
	}

	public static void add() {
	

					Scanner ip = new Scanner(System.in);
					System.out.println("==============================================");
					System.out.println("Nhập Thông Tin : ");
					System.out.print("Nhập tên sinh viên:  : ");
					String name = ip.nextLine();
					System.out.print("Nhập mã sinh viên : ");
					String id = ip.nextLine();
					System.out.print("Nhập điểm thực hành : ");
					int Pointth = ip.nextInt();
					System.out.print("Nhập điểm lí thuyết : ");
					int Pointlt = ip.nextInt();
	}
					

	public static void search01(Students[] s) {
		for (int i = 0; i < s.length; i++) {
			if ((s[i].getPointlt() + s[i].getPointth()) / 2 > 8.5) {
				System.out.println(s[i]);
			}
		}
	}
	public static void seach02(Students[] s) {
		for(int i = 0; i < s.length; i++) {
			if(s[i].getPointlt() > s[i].getPointth()) {
				System.out.println(s[i]);
			}
		}
	}
}
