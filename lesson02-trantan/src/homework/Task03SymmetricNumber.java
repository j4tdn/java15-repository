package homework;

import java.util.Scanner;

public class Task03SymmetricNumber {
	public static void main(String[] args) {
		System.out.print("Enter number: ");
		int number = new Scanner(System.in).nextInt();
		
		
		System.out.println("is symmertric number: " +checkSymmetricNumber(number));
	}
	
	private static boolean checkSymmetricNumber(int x) {
		int symmetric = 0;
		int temp = x;
		while (x != 0) {
			
			symmetric *= 10 + x % 10;
			x /= 10;
		}
		return symmetric == temp ? true : false;
	}
}
