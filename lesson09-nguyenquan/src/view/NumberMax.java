package view;

import java.util.Arrays;
import java.util.Scanner;

public class NumberMax {
	public static void main(String[] args) {

//	
//	Scanner scanner = new Scanner(System.in);
//	System.out.println("enter string number:");
//	int amount = scanner.nextInt();
//	String []listString = new String[amount]; 
//	scanner.nextLine();
//	for(int i = 0; i<listString.length; i++ ) {
//		System.out.println("Enter String:");
//		
//		listString[i] = scanner.nextLine();
//	}
		String[] listString = { " aa6b546c6e22h", "aa6b326c6e22h" };
		String[] results = getLargestNumbers(listString);
		for (String result : results) {
			System.out.print(result + " ");
		}

	}

	private static String[] getLargestNumbers(String[] listString) {

		String[] result = new String[listString.length];
		int rid = 0;

		for (String string : listString) {
			String maxNumber = "0";
			String[] number = new String[string.length()];
			number = string.split("[a-z]+");

			number = Arrays.copyOfRange(number, 1, number.length);

			for (String stringNumber : number) {
				Integer.parseInt(stringNumber);

				if (Integer.parseInt(stringNumber) > Integer.parseInt(maxNumber)) {
					maxNumber = stringNumber;
				}
			}

			result[rid++] = maxNumber;

		}
		for (int i = 0; i < listString.length; i++) {
			for (int j = i + 1; j < listString.length; j++) {
				if (Integer.parseInt(result[i]) > Integer.parseInt(result[j])) {
					String temp = result[i];
					result[i] = result[j];
					result[j] = temp;
				}
			}

		}
		return result;
	}
}
