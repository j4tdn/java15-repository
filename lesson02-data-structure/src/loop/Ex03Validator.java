package loop;
import java.util.Scanner;
public class Ex03Validator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String numberAsText = "";
		int incorrectedInputAmount = 0;
		// Validation
		do {
			System.out.println("Enter valid number: ");
			numberAsText = sc.nextLine();
			if(numberAsText.matches("\\d+")) {
				break;
			}
			incorrectedInputAmount++;
			if(incorrectedInputAmount == 3) {
				System.out.println("Wrong input amount exceeds 3 times.");
				System.out.println("Exit");
				System.exit(0);
			}
		}while(true);
		
		int number = Integer.parseInt(numberAsText);
		System.out.println("====================================");
		System.out.println("Value: "+number);
	}
}
