package control;

import java.util.Random;

public class Ex04_SwitchCasePhase2 {
	public static void main(String[] args) {
		int month = new Random().nextInt(1,13);
		System.out.println(month);
		if(month == 1 || month == 3 || month == 5 || month == 7 
				|| month == 8 || month == 10 || month == 12) {
			System.out.println(month + "has 31 days");
		}
		else if( month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println(month + "has 30 days");
		}
		else {
			System.out.println(month + " has 29 days");

		}
	}
}
