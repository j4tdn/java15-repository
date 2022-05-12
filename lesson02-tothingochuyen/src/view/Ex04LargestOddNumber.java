package view;

import java.util.Scanner;

public class Ex04LargestOddNumber {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter the size of array number: ");
		int n = ip.nextInt();
		int[] a = new int[n];
		int maxOddNumber = 0;
		for(int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = ip.nextInt();
		}
		for(int i = 0; i < n; i++) {
			if(isOddNumber(a[i])) {
				if(a[i] > maxOddNumber) {
					maxOddNumber = a[i];
				}
			}
		}
		if(maxOddNumber == 0) {
			System.out.println("There are no odd number in the array");
		}else {
			System.out.println("The largest odd number is " + maxOddNumber);
		}
	}
	
	private static boolean isOddNumber(int n) {
		return n % 2 != 0;
	}
}
