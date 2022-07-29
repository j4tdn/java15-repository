package view;

import java.util.Scanner;

public class Ex02 {
	private static void getLargestNumbers(String str) {
		int num = 0, res = 0;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i)))
				num = num * 10 + (str.charAt(i) - '0');
			else {
				res = Math.max(res, num);
				num = 0;
			}
		}
		System.out.println( Math.max(res, num));
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n = Integer.parseInt(ip.nextLine());
		while(n > 0) {
			String str = ip.nextLine();
			getLargestNumbers(str);
			n--;
		}
		
	

	}
}
