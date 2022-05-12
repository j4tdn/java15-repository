package main;

import java.util.Scanner;

public class TestArr {
public static void main(String[] args) {
	int[] arr = new int[10];
	Scanner sc = new Scanner(System.in);
	for (int i = 0; i < arr.length; i++) {
		System.out.println("nhap phan tu thu " +i);
		arr[i] = sc.nextInt();
		
		}
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]%2==1) {
			System.out.println(arr[i]+ " la so le");
		}
	}
		
	
	
	
	
}
}
