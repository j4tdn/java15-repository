package utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtils {
	private static GregorianCalendar gc = new GregorianCalendar();
	 private DateUtils() {
		
	}
	public static boolean isLeapyear(int year) {
		return gc.isLeapYear(year);
	}
	public static Calendar getInstant(int year, int month, int date) {
		Calendar c = Calendar.getInstance();
		
		c.set(year, month, date);
		
		return c;
	}
//	public static WeekdayType datesAsVnm(Calendar c) {
//		int dowAsInt = 
//	}
	public static String format(String pattern, Date date) {
		return new SimpleDateFormat(pattern).format(date);
	}
	public static Calendar getTime( int date, int month) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DATE, date);
		c.set(Calendar.MONTH, month);
		
		
		return c;
	}
//	public static boolean isHolyday(Calendar checkedCal, Calendar[] holydays) {
//		int dayofMonth = checkedCal.get(Calendar.DAY_OF_MONTH);
//		int month = checkedCal.get(Calendar.MONTH);
//		for (Calendar holyday : holydays) {
//			if(dayofMonth == holyday.get(Calendar))
//		}
//	}
	public static Calendar getInstant(int year, int month, int date, int hour, int minute, int second) {
		Calendar c = Calendar.getInstance();
		 c.set(year, month, date, hour, minute, second);
		 return c;
	}
	public static String optinal(long dmy, String unit) {
		return dmy > 0 ? (dmy + " " + unit + " ") : "";
	}
}
