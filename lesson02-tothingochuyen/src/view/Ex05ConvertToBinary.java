package view;

import java.util.Scanner;

public class Ex05ConvertToBinary {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter decimal number to convert: ");
		int n = ip.nextInt();
		System.out.println("Binary number: " + convertToBinary(n));
	}
	
	private static String convertToBinary(int n) {
		int[] a = new int[100];
		int i = 0;
		String s = "";
		while(n > 0) {
			a[i] = n % 2;
			n = n / 2;
			i++;
		}
		for(int j = i - 1; j >= 0; j--) {
			s = s + a[j];
		}
		return s;
	}
}
