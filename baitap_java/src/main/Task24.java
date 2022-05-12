package main;

import java.util.Scanner;

public class Task24 {

	public double average() {
		int sum = 0;
		double ave = 0;
		int[] arr = new int[5];

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Nhập phần tử thứ " +(i+1));
			arr[i] = sc.nextInt();
		}
			
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		ave = (double) sum / arr.length;
		return ave;
	}

	public static void main(String[] args) {
		Task24 ave = new Task24();
		double as = ave.average();
		System.out.println(as);
	}

}
