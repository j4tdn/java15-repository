package view;

import java.util.Scanner;

public class Ex04Odd {
	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Nhập vào số phần tử của dãy số: ");
			n = scanner.nextInt();
		} while (n < 0);
		int array[] = new int[n];
		System.out.println("Nhập các phần tử cho dãy số: ");
		for (int i = 0; i < n; i++) {
			System.out.print("Nhập phần tử thứ " + i + ": ");
			array[i] = scanner.nextInt();
		}
		System.out.println("\nDãy số nhập vào: ");
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + "\t");
		}
		int Odd=0;
		for (int i=0;i<n;i++){
            if (array[i] % 2 == 1 && array[i] >Odd)
            {  Odd = array[i];}
        }
		System.out.println("\nSố lẻ lớn nhất: "+Odd);
	}

}
