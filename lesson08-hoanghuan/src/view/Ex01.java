package view;

import java.util.Scanner;

public class Ex01 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		/*System.out.print("Input: ");
		String s = sc.nextLine();
		*/
		String s = "I am Hoàng Huân";
		System.out.println("Output:");
		System.out.println("Term 1:");
		term1(s);
		System.out.println("Term 2:");
		term2(s);
		System.out.println("Term 3:");
		term3(s);
		System.out.println("Term 4:");
		term4(s);
	}
	
	private static void term1(String s) {
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i)+" ");
		}
		System.out.println("===============");
	}
	
	private static void term2(String s) {
		String[] arr = s.split("\s+");
		for(int i = 0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
			if (i == arr.length - 1) {
				System.out.println();
			}
		}
		System.out.println("===============");
	}
	
	private static void term3(String s) {
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
			if (i == 0) {
				System.out.println();
			}
		}
		System.out.println("===============");

	}
	
	private static void term4(String s) {
		String[] arr = s.split("\s+");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] +" ");
		}
	}
}
