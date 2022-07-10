package utils;

import java.util.Calendar;
import java.util.GregorianCalendar;

import common.WeekDayType;

public class DateUtils {
	private static GregorianCalendar gc = new GregorianCalendar();
	private static WeekDayType[] weekDays = WeekDayType.values();
	
	private DateUtils() {
		
	}
	public static boolean isLeapYear(int year) {
		return gc.isLeapYear(year);
		
		
	}
	public static Calendar getInstance( int month, int year) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.MONTH, month);
		c.set(Calendar.YEAR, year);
		return c;
		
		}
	public static WeekDayType getWdasVnmese(Calendar c) {
		int dowAsInt = c.get(Calendar.DAY_OF_WEEK);
		return weekDays[dowAsInt - 1];
	}
	
	}
		
	

