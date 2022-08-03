package view;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String s1, s2;
		System.out.println("Enter S1: ");
		s1 = ip.nextLine();
		System.out.println("Enter S2: ");
		s2 = ip.nextLine();
		System.out.println("Find the longest common substring: " + findTheLongest(s1, s2));
	}
	private static String findTheLongest (String s1, String s2) {
		int m = s1.length();
		int n = s2.length();
		int max = 0;
		for(int i = 0; i<m; i++) {
			for(int j = 0; j<n; j++) {
				if(s1.charAt(i) == s2.charAt(i)) {
					
				}
			}
		}
	}
}
