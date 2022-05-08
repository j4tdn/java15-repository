package control;

import java.util.Random;

public class Ex04SwitchCasePhase2 {
	public static void main(String[] args) {
		int month = 1 + new Random().nextInt(12);
		System.out.println("month: " + month);
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month + " has 31 days");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month + " has 30 days");
			break; 
		case 2:
			System.out.println(month + " has 328 days");
			break;

		default:
			System.out.println(" invalid month");
			break;
		}

		System.out.println("==========================");
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.println(month + "has 31 days");
		} else {
			System.out.println(month + "has 30 days");
		}
	}
}
