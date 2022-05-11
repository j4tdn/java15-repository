package view;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04ArrayOddNumber {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter Numbers");
		String input = ip.nextLine();
		String[] numbers = input.split(" ");
		ArrayList<Integer> elements = new ArrayList<Integer>();
		for (String number : numbers) {
			elements.add(Integer.parseInt(number));
		}
		System.out.println(elements);
		int findMax = 0;
		for (int i = 0; i < elements.size(); i++) {

			if (elements.get(i) % 2 != 0) {
				findMax = elements.get(i) >= findMax ? elements.get(i) : findMax;

			}

		}
		System.out.println(findMax);
	}
}
