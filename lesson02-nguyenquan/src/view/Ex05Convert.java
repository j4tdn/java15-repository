package view;

import java.util.Scanner;

public class Ex05Convert {
	public static void main(String[] args) {
		System.out.print("Enter input:");
		int ip = new Scanner(System.in).nextInt();
		System.out.println("converted to base 2 is " + convert(ip));

	}

	private static StringBuilder convert(int ip) {

		int number = ip;
        
		String base2 = "";

		while (number > 0) {
			base2 = base2 + (number % 2);
			number = number / 2;
		}
		StringBuilder results = new StringBuilder(base2);
		results.reverse().toString();
		return results;
	}
}
