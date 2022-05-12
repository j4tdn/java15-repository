package main;

import java.util.Scanner;

public class Task27 {
	public static void main(String[] args) {
		char[] arr = new char[5];
		Scanner sc = new Scanner(System.in);
	for (int i = 0; i < arr.length; i++) {
		System.out.println("Nhập phân tử thứ "+(i+1));
		arr[i] = sc.nextLine().charAt(0);
		
	}	
//	String str = new String(arr);
//	System.out.println(arr);
	String str = String.valueOf(arr);
	System.out.println(str);
	}
}
