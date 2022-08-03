package ex01;

import java.util.Scanner;

public class Ex01 {
	static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Mời nhập chuỗi:");
		String string = ip.nextLine();
		PrintCharater(string);
		System.out.println("\n");
		PrintWord(string);
		System.out.println("\n");
		ReverseCharater(string);
		System.out.println("\n");
		ReverseWord(string);
		//System.out.println(string);
		
	}
	private static void PrintCharater(String string) {
		for(int i = 0; i<string.length();i++) {
			System.out.print(string.charAt(i)+ " ");
		}
	}
	private static void PrintWord(String string) {
		String[] str = string.split("\\s");
		for(int i = 0; i<str.length;i++) {
			System.out.print(str[i] + " ");
		}
	}
	private static void ReverseCharater(String string) {
		for(int i = string.length()-1; i>=0;i--) {
			System.out.print(string.charAt(i) + " ");
		}
	}
	
	private static void ReverseWord(String string) {
		String[] str = string.split("\\s");
		for(int i = str.length-1; i>=0;i--) {
			System.out.print(str[i] + " ");
		}
	}
	
	
	
	
	
}
