package utils;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

import common.WeekDayType;

public class DateUtils {
	private static GregorianCalendar gc = new GregorianCalendar();
	private static WeekDayType[] weekDays = WeekDayType.values();
	public static Calendar getIntance(int month, int year) {
	Calendar c = Calendar.getInstance();
	c.set(Calendar.YEAR, year);
	c.set(Calendar.MONTH, month);
	return c;
	
	
	}
	public static Calendar getIntance(int date, int month, int year, int hour, int minute, int second) {
		Calendar c = Calendar.getInstance();
		c.set(year, month, date, hour, minute, second);
		return c; 	
		}
	public DateUtils() {
		
	}
	public static WeekDayType getWdAsVnmese(Calendar c) {
		int dowAsInt = c.get(Calendar.DAY_OF_WEEK);
		return weekDays[dowAsInt - 1];
	}
	public static boolean isLeapYear(int year) {
		return gc.isLeapYear(year);  
	}
	public static String between(Calendar start, Calendar end) {
		if(start.after(end)) {
			throw new  IllegalArgumentException("start date cannot exceed end date!!!");	
		}
		long startInMils = start.getTimeInMillis();
		long endtInMils = end.getTimeInMillis();
		long duration = endtInMils -startInMils;
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		duration -= TimeUnit.DAYS.toMillis(days);
		
		long hour = TimeUnit.MILLISECONDS.toHours(duration);
		duration -= TimeUnit.HOURS.toMillis(hour);
		
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		duration -= TimeUnit.MINUTES.toMillis(minutes);
		
		long second = TimeUnit.MILLISECONDS.toSeconds(duration);
		duration -= TimeUnit.SECONDS.toMillis(second);

		
		return days + " D  " + hour + " H " + minutes + " M " + second + " S " + duration + " MS ";
	}
	public static String optional(long dmy, String unit) {
		return dmy > 0 ? dmy + " " + unit : " ";
	}
	public static int weeknumber(Calendar c) {
		int count = 0;
		for(int i = 0; i <= 11; i++) {
			c.set(Calendar.MONTH, i);
			count += c.get(Calendar.WEEK_OF_MONTH);
			
		}
		return count;
	}
}
