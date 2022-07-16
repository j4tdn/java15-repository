package view;

import java.util.Scanner;

import utils.Ex02Utils;


public class Ex02 {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int year, month, day;
		do {
			try {
				System.out.println("Enter year");
				year = Integer.parseInt(sc.nextLine());
				System.out.println("Enter month");
				month = Integer.parseInt(sc.nextLine());
				System.out.println("Enter day");
				day = Integer.parseInt(sc.nextLine());
				break;
			} catch (Exception e) {
				e.printStackTrace();
			}
		} while (true);
		
		Ex02Utils.getDay(year, month-1, day);
	}
}


