package baitaplogic;

import java.util.Scanner;

public class PhuongTrinhBac2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập a, b , c");
		int a = Integer.parseInt(sc.nextLine());
		int b = Integer.parseInt(sc.nextLine());
		int c = Integer.parseInt(sc.nextLine());
		
		giaiPt(a, b, c);
	}
	private static void giaiPt(float a, float b, float c) {
		float delta, x1, x2;
		if(a == 0) {
			System.out.println("PT có 1 nghiệm x = " + -c / b);
		}else {
			delta = b * b - (4 * a * c);
			if(delta > 0) {
				x1 = (float) (-b + Math.sqrt(delta / (2 * a)));
				x2 = (float) (-b - Math.sqrt(delta / (2 * a)));
				System.out.println("phương trình có 2 nghiệm \n x1 = " + x1 + "\n x2 = " + x2 );
			}else if (delta == 0) {
				System.out.println("phương trình có 2 nghiệm x1 = x2 = " + -b / (2 * a));
			}else {
				System.out.println("phương trình vô nghiệm");
			}
		}
	}
}
