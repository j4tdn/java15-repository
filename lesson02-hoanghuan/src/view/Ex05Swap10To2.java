package view;

import java.util.Scanner;

public class Ex05Swap10To2 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = ip.nextInt();
		ip.close();
		int i = 1;
		int array[] = new int[1000];
		while (n>0) {
			array[i] = n % 2;
			i++;
			n/=2;
		}
		for (int j = i-1; j>=1; j--) {
			System.out.print(array[j]);
		}
	}
}
