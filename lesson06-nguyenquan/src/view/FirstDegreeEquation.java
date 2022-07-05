package view;
import java.util.Scanner;

public class FirstDegreeEquation {
	public static void main(String[] args) {
		do{
		try {
			
				input();
				break;
			
		} catch (NumberFormatException | ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("please re-enter!!!");
		}
		
		}while(true);
	}

	public static void input() {
		int a = 0, b = 0;
		String aInput = "", bInput = "";
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a:");
		aInput = scanner.nextLine();
		if (aInput.equals("0")) {
			throw new ArithmeticException("enter a number other than 0!!!");
		}
		if (aInput.matches("\\d+")) {
			a = Integer.parseInt(aInput);
		} else {
			throw new NumberFormatException("enter a number!!!");
		}
		System.out.print("Enter b:");
		bInput = scanner.nextLine();
		if (bInput.matches("\\d+")) {
			b = Integer.parseInt(bInput);
		} else {
			throw new NumberFormatException("enter a number!!!");
		}
		System.out.println("x = -" + b + "/" + a);
		

	}

}
