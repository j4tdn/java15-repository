package view;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Input: ");
		int n = Integer.parseInt(sc.nextLine());
		*/
		int n = 100;
		String s = ""; int i = 1;
		while (true) {
			s += Integer.toString(i);
			i++;
			if (s.length() >= n) {
				break;
			}
		}
		System.out.println(s.charAt(n));
	}
}
