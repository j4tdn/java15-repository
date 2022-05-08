package exercise;

import java.util.Scanner;

public class Ex01Exponential {
	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		System.out.print("Moi ban nhap so can kiem tra:");
		int x = ip.nextInt();
		check(x);
	}
	private static void check(int x) {
		double a= Math.log10(x*1.0)/Math.log10(2.0);
		if(a-(int)a==0) System.out.println("YES");
		else System.out.println("NO");
	}
}
