package main;

import java.util.Scanner;

public class Task32 {
public static void main(String[] args) {
	int n;
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhập số nguyên ");
	n = sc.nextInt();
	System.out.print("ước của " +n+ " là: ");
	for (int i = 1; i < n; i++) {
		if(n%i==0) {
		
			System.out.print(i+ " ");
		}
	}
}
}
