package exercises;

import java.util.Calendar;

public class Ex02 {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int year =  c.get(Calendar.YEAR);
		int month =1 + c.get(Calendar.MONTH);
		if (year % 4 == 0 && year % 100 != 0) {
			System.out.println("Nam nay co 366 ngay");
		} else {
			System.out.println("Nam nay co 365 ngay");
		}
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Thang " + month + " co 31 ngay");
			break;
		
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Thang " + month + " co 30 ngay");
			break;
		case 2: 
			if (year % 4 == 0 && year % 100 != 0) {
				System.out.println("Thang " + month + " co 29 ngay");
			} else {
				System.out.println("Thang " + month + " co 28 ngay");
			}
			
			break;
		}
	}

}
