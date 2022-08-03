package ex02;

import java.util.Scanner;

public class Ex02 {
	static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Mời nhập tên:");
		String string = ip.nextLine();
		FommatName(string);
		
	}
	private static void FommatName(String string) {
		String[] str = string.split("\\s");
		String stringnew ="";
		for(int i = 0; i<str.length;i++) {
			stringnew =stringnew + Character.toUpperCase(str[i].charAt(0)) + str[i].substring(1).toLowerCase() + " ";
		}
		System.out.println(stringnew);
	}
}
