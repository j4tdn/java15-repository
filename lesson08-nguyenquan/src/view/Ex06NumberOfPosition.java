package view;

import java.util.Scanner;

public class Ex06NumberOfPosition {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number:");
		int n= scanner.nextInt();
		System.out.println("result:"+ numberOfposition(n));
		
	}


private static int numberOfposition(int n) {
	int result = 0;;
	String string = "";
	for(int i = 1; i<=n; i++) {
		string += i + "";
		
	}
	result = Integer.parseInt(string.charAt(n-1)+"");
	return result;
}
}