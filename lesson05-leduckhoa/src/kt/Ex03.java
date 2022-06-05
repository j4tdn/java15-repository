package kt;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Mời nhập n:");
		int n = ip.nextInt();
		int[] a = new int[n];
		for(int i = 0; i<n;i++) {
			System.out.print("a["+i+"]=");
			a[i] = ip.nextInt();
		}
		
		System.out.println("BCNN = " + getLeastCommonMultiple(a, n));
		
	}
	
	private static int getLeastCommonMultiple(int[] a, int n) {
		int c=(a[0]*a[1])/GCD(a[0], a[1]);
		for(int i = 2; i<n;i++) {
			c=(c*a[i])/GCD(c, a[i]);
		}
		return c;
	}
	private static int GCD(int a, int b) {
		if (b==0) return a;
		return  GCD(b, a%b);
	}
	
	
	
	
}
