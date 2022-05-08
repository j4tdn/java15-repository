package loop;

import java.util.Scanner;

public class Ex03Validator {
public static void main(String[] args) {
	Scanner ip = new Scanner(System.in);
	String numberAsText = "";
 int incorrectInputAmount = 0;
	do {
	System.out.println("Enter valid number: ");
	 numberAsText = ip.nextLine();
	 if(!numberAsText.matches("\\d+")){
		 break;
	 }
	 
	incorrectInputAmount++;
	if(incorrectInputAmount==3) {
		System.out.println("\n>>wrong input amount exxeeds 3 times");
		System.out.println("Exit");
		System.exit(0);
	}
	}while(true);
	int number = Integer.parseInt(ip.nextLine());
}
}
