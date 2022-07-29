package view;

import java.util.Scanner;

public class NumberMax {
	public static void main(String[] args) {
		
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter string number:");
	int amount = scanner.nextInt();
	String []listString = new String[amount]; 
	scanner.nextLine();
	for(int i = 0; i<listString.length; i++ ) {
		System.out.println("Enter String:");
		
		listString[i] = scanner.nextLine();
	}
	
	}
private static String[]	getLargestNumbers(String [] listString) {
	String[] number = new String[1000];
	String maxNumber = "0";
	String []result = new String[listString.length];
	for(String string:listString ) {
		
		 number = string.split("\\s+");
			
	}
	for(String string:number ) {
		System.out.println(string);
		 
			
	}
	
}
	

}
