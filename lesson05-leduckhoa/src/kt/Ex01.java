package kt;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Mời bạn nhập a:");
		int a = ip.nextInt(); 
		System.out.print("Mời bạn nhập b:");
		int b=ip.nextInt();
		if(isPowerOf(a, b) == false) System.out.println("Không phải");
		else System.out.println("Phải");
		
	}
	
	private static boolean isPowerOf(int a, int b) {
		int c = (a>=b ? a : b), d = (a>=b ? b : a);
		double k = Math.log10(c*1.0)/Math.log10(d*1.0);
		if(k-(int)k== 0) return true;
		return false;
	}
}
