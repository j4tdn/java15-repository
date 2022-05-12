package main;

import java.util.Scanner;

public class Task25 {
	public static void main(String[] args) {
		int i, j, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số phần tử chủa mảng");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for (i = 0; i < arr.length; i++) {
			System.out.println("Nhập phần tu thứ "+(i+1));
			arr[i] = sc.nextInt();
		}
		j = i -1;
		i = 0;
		
		while (i<j) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		System.out.println("Mảng sau khi đảo ngược ");
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

}
