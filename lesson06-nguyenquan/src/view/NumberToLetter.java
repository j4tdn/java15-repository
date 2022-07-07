package view;

import java.util.Scanner;

import exception.InvalidException;

public class NumberToLetter {
	public static void main(String[] args) {
		String letters[] = { "không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín" };
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number:");
		String number = scanner.nextLine();
		try {
			readNumber(number, letters);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void oneNumber(String number, String letters[]) {

		int number1 = Integer.parseInt(number);
		System.out.println(letters[number1]);
	}

	public static void twoNumber(String number, String letters[]) {

		int number2 = Integer.parseInt(number);
		letters[0] = "";
		int a = (int) number.charAt(0) - 48;
		int b = (int) number.charAt(1) - 48;

		if (number2 >= 20 && number2 <= 99) {
			letters[1] = "mốt";

			System.out.println(letters[a] + " mươi " + letters[b]);
		}
		
		else {
			System.out.println("mười " + letters[b]);
		}
	}

	public static void threeNumber(String number, String letters[]) {
		int number3 = Integer.parseInt(number);
		letters[0] = "";
		int a = (int) number.charAt(0) - 48;
		int b = (int) number.charAt(1) - 48;
		int c = (int) number.charAt(2) - 48;

		
		if (number3 > 100 && number3 < 110) {
			System.out.println(letters[a] + " trăm lẻ " + letters[c]);
		} else {
			if(b == 0&& c==0) {
				System.out.println(letters[a] +" trăm");
			}
			else {
			char data[] = { number.charAt(1), number.charAt(2) };
			String s = String.copyValueOf(data);
			System.out.print(letters[a] + " trăm ");
			twoNumber(s, letters);
			}

		}

	}

	public static void exceptionNumber(String number) {
		throw new InvalidException("numbers in the range(0,999)");

	}
	public static void readNumber(String number, String letters[]) {
		if (number.length() == 1) {
			oneNumber(number, letters);
		} else if (number.length() == 2) {
			twoNumber(number, letters);
		} else if (number.length() == 3) {
			threeNumber(number, letters);
		} else {
			exceptionNumber(number);
		}
	}
}