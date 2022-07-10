package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import common.WeekDayType;

public class DateUtils {
	
	private static GregorianCalendar gc = new GregorianCalendar();
	private static WeekDayType[] weekDays = WeekDayType.values();
	
	private DateUtils() {
		
	}
	
	public static String format(String pattern, Calendar c) {
		return new SimpleDateFormat(pattern).format(c.getTime());
	}
	
	public static String format(String pattern, Date date) {
		return new SimpleDateFormat(pattern).format(date);
	}
	
	public static boolean isLeapYear(int year) {
		return gc.isLeapYear(year);
	}
	
	public static Calendar getInstance(int date, int month, int year) {
		Calendar c = Calendar.getInstance();
		c.set(year, month, date);
		return c;
	}
	
	public static Calendar getTime(int date, int month) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.MONTH, month);
		c.set(Calendar.DAY_OF_MONTH, date);
		return c;
	}
	
	public static Calendar getInstance(int month, int year) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.MONTH, month);
		c.set(Calendar.YEAR, year);
		return c;
	}
	
	public static WeekDayType getWdAsVnmese(Calendar c) {
		int dowAsInt = c.get(Calendar.DAY_OF_WEEK);
		return weekDays[dowAsInt-1];
	}
}
