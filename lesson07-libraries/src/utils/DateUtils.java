package utils;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateUtils {
	
	private static GregorianCalendar gc = new GregorianCalendar();

	public DateUtils() {
	}
	
	public static boolean isLeapYear(int year) {
		return gc.isLeapYear(year);
	}
	
	public static Calendar getInStance(int month, int year) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.MONTH, month);
		c.set(Calendar.YEAR, year);
		
		return c;
	}
}
