package view;

import java.util.Scanner;

public class Ex03Sysmetry {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n = Integer.parseInt(ip.nextLine());
		if(check(n) == 1) System.out.println(n + " là số đối xứng");
		else System.out.println(n + " không phải là số đối xứng");
	}
	private static int check(int n) {
		int k = 0, a=n;
	    while(a > 0) {
	    	int b = a%10;
	    	k = k * 10 + b;
	    	a /= 10;
	    }
	    if(k == n) return 1;
	    return 0;
	}
}
