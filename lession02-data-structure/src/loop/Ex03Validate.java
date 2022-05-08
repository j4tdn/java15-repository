package loop;

import java.util.Scanner;

public class Ex03Validate {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		String numberAsText= "";
		int incorrectInputAmount=0;
		
		//validation
		do{
			System.out.println("Enter Invalid Number:");
			numberAsText= ip.nextLine();
			if(numberAsText.matches("\\d+")) {
				break;
			}
		incorrectInputAmount++;
		if(incorrectInputAmount==3) {
			System.out.println(">>Wrong input amount exceeds 3 times");
			System.exit(0);
		}
		}
		while(true) ;
		int number = Integer.parseInt(numberAsText);
		System.out.println("==========");
		System.out.println("Value:" + number);
	}
}
