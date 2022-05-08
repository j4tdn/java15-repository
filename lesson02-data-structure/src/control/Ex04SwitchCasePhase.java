package control;

import java.util.Random;

public class Ex04SwitchCasePhase {
	public static void main(String[] args) {
		int month = new Random().nextInt(12);
		System.out.println("month: " + month);

		switch (month) {
		case 1, 3, 5, 7, 8, 10, 12: {

			System.out.println("month " + month + " has 31 days!!");
			break;
		}
		case 4, 6, 9, 11: {

			System.out.println("month " + month + " has 30 days!!");
			break;
		}
		case 2: {

			System.out.println("month " + month + " has 28 days!!");
			break;
		}
		default:
			System.out.println("Invalid month");
			return;
		}
	}
}
