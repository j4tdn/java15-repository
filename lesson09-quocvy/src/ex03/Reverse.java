package ex03;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		String s ="Welcome    to   JAVA10      class";
		String s1 = s.replaceAll("\\s+", " ");
		String s2 ="";
		for (int i = s1.length() - 1; i >= 0; i--) {
			s2 += s1.charAt(i);
		}
		System.out.print(s2);
	}


}
