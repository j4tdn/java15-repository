package control;

import java.util.Random;

public class Ex04SwitchCasePhase2 {
	public static void main(String[] args) {
		int month = new Random().nextInt(1, 12);
		System.out.println("month: " + month);
		
		switch (month) {
		case 1,3,5,7,8,10,12:
			System.out.println(month + " has 31 days !");
			break;
		case 4, 6 ,9 ,11:
			System.out.println(month + " has 30 days !");
			break;
		default:
			System.out.println(month + " has 28 or 29 days !");
		}

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 
				|| month == 12) {
			System.out.println(month + " has 31 days !");
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println(month + " has 30 days !");
		} else {
			System.out.println(month + " has 28 or 29 days !");
		}
	}
}
