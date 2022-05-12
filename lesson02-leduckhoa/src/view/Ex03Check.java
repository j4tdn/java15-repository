package view;

import java.util.Scanner;

public class Ex03Check {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Moi nhap so:");
		int x = ip.nextInt();
		Check(x);
	}
	private static void Check(int x) {
		int a = (int) (Math.log10(x*1.0)+1);
		
		int[] b = new int[a];
		int k=0;
		for(int i= a-1; i>=0;i--) {
			b[i] = x%10;
			x/=10;
		}
		for(int i = 0 ; i<= a/2 ; i++ ) {
			if(b[i] != b[a-1-i]) {
				System.out.println("NO");k++;break;
			}
		}
		if(k == 0) System.out.println("YES");
	}
}
