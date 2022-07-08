package ex04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadingNumber {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		int number = checkInput();
		System.out.println("To Vietnamese: " + readNumber(number));
	}
	
	private static int checkInput() {
		try {
			int input = sc.nextInt();
			if (input < 0 || input > 999) {
				System.err.println("Input must be in range [0 - 999]");
				System.out.print("Enter again: ");
				return checkInput();
			}
			return input;
		} catch (Exception e) {
			System.err.println("Input must be a number!");
			System.out.print("Enter again: ");
			sc.nextLine();
			return checkInput();
		}
	}
	
	private static List<Integer> listNumber(int number) {
		List<Integer> list = new ArrayList<>();
		if (number == 0) {
			list.add(0);
		} else {
			while (number != 0) {
				int element = number % 10;
				list.add(element);
				number /= 10;
			}
		}
		return list;
	}
	
	private static String readNumber(int number) {
		List<Integer> list = listNumber(number);
		String[] units = { "khong ", "mot ", "hai ", "ba ", "bon ", "nam ", "sau ", "bay ", "tam ", "chin " };
		String read = "";
		int numberOfElements = list.size();
		if (numberOfElements == 1) {
			read += units[number];
		} else if (numberOfElements == 2) {
			read += readNumber2(number);
		} else {
			int res3 = list.get(2);
			int res2 = list.get(1);
			int res1 = list.get(0);
			read += units[res3] + "tram ";
			if (res1 == 0 && res2 == 0) {
				return read;
			}
			if (res2 == 0) {
				read += "le ";
				if (res1 == 1) {
					read += "mot ";
				} else {
					read += units[res1];
				}
			} else {
				int number2 = res2 * 10 + res1;
				read += readNumber2(number2);
			}
		}
		return read;
	}
	
	private static String readNumber2(int number) {
		String read = "";
		String[] units = { "khong ", "mot ", "hai ", "ba ", "bon ", "nam ", "sau ", "bay ", "tam ", "chin " };
		List<Integer> elements = listNumber(number);
		int res2 = elements.get(1);
		int res1 = elements.get(0);
		if (res2 == 1) {
			read += "muoi ";
			if (res1 == 0) {
				return read;
			} else {
				read += units[res1];
			}
		} else {
			read = read + units[res2] + "muoi ";
			if (res1 == 0) {
				return read;
			}
			if (res1 == 1) {
				read += "mot ";
			} else if (res1 == 5) {
				read += "lam ";
			} else {
				read += units[res1];
			}
		}
		return read;
	}
}