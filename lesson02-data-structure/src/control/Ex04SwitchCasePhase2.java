package Control;


import java.util.Random;

public class Ex04SwitchCasePhase2 {
	public static void main(String[] args) {
		int month = new Random().nextInt(12);
		System.out.println("Month: "+ month);
		
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8  || month == 10 || month == 12 ) {
			System.out.println(month+" has 31 days");
		} else if (month == 4 || month == 6 || month == 9 || month == 11 ) {
			System.out.println(month+" has 30 days");
		} else System.out.println(month+" has 28 days");
		switch (month) {
		case 1:
			System.out.println(month+" has 31 days");
			break;
		case 3:
			System.out.println(month+" has 31 days");
			break;
		case 5:
			System.out.println(month+" has 31 days");
			break;
		case 7:
			System.out.println(month+" has 31 days");
			break;
		case 8:
			System.out.println(month+" has 31 days");
			break;
		case 10:
			System.out.println(month+" has 31 days");
			break;
		case 12:
			System.out.println(month+" has 31 days");
			break;
		case 4:
			System.out.println(month+" has 30 days");
			break;
		case 6:
			System.out.println(month+" has 30 days");
			break;
		case 9:
			System.out.println(month+" has 30 days");
			break;
		case 11:
			System.out.println(month+" has 30 days");
			break;
		case 2:
			System.out.println(month+" has 28 or 29 days");
			break;
		}	
	}
}
