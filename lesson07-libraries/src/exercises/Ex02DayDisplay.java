package exercises;

import java.util.Calendar;

public class Ex02DayDisplay {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println("dayOfMonth: " + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("dayOfYear: " + c.get(Calendar.DAY_OF_YEAR));
	}
}
