package exercise4;

import java.util.Random;
import java.util.Scanner;

public class Bai4 {
	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("nhap n: ");
		int n= input.nextInt();
		int[] getUniqueNumbers = new int[n];

		for (int i = 0; i < n; i++) {
			getUniqueNumbers[i] = input.nextInt();
		}

		for (int test : getUniqueNumbers) {
			
		}
	}
}


