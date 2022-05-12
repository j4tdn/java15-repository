package testemnum;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Circle cc = Circle.INSIDE;
		Circle cc1 = Circle.ONSIDE;
		Circle cc2 = Circle.OUTSIDE;
		double ox, oy, ax, ay, r;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ox");
		ox = sc.nextDouble();
		System.out.println("nhap oy");
		oy = sc.nextDouble();
		System.out.println("nhap ax");
		ax= sc.nextDouble();
		System.out.println("nhap ay");
		ay = sc.nextDouble();
		System.out.println("nhap ban kinh r");
		r = sc.nextDouble();
		double n = (ox-ax)*(ox-ax)+(oy-ay)*(oy-ay);
		double m = r*r;
		if (m>n) {
			System.out.println(cc.value);
		}else if(m<n) {
			System.out.println(cc2.value);
			
		}else {
			System.out.println(cc1.value);
		}
	
	}
}
