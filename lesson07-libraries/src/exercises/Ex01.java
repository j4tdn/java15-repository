package exercises;

import java.util.Calendar;

public class Ex01 {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		if (year % 4 == 0 && year % 100 != 0) {
			System.out.println("Nam nay la nam nhuan");
		} else {
			System.out.println("Nam nay khong phai nam nhuan");
		}
	}

}
