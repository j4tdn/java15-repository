package ex03;

import java.util.Scanner;

public class RemoveWhitespace {
	public static void main(String[] args) {
		String s = "Welcome                to JAVA10 class";
		String s1 = s.replaceAll("\\s+", " ");
		System.out.println(s1);
	}
}


