package utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

public class DateUtils {
	
	private static GregorianCalendar gc = new GregorianCalendar();

	public DateUtils() {
	}
	
	public static boolean isHoliday(Calendar checkedCal, Calendar[] holidays) {
		int dayInMonth = checkedCal.get(Calendar.DAY_OF_MONTH);
		int month = checkedCal.get(Calendar.MONTH);
		for(Calendar holiday: holidays) {
			if(dayInMonth == holiday.get(Calendar.DAY_OF_MONTH) && month == holiday.get(Calendar.MONTH)){
				return true;
			}
		}
		return false;
	}
	
	public static String format(String pattern, Calendar c) {
		return new SimpleDateFormat(pattern).format(c.getTime());
	}
	
	public static boolean isLeapYear(int year) {
		return gc.isLeapYear(year);
	}
	
	public static Calendar getTime(int date, int month) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.MONTH, month);
		c.set(Calendar.DAY_OF_MONTH, date);
		return c;
	}
	
	
	public static Calendar getInstance(int month, int year) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.MONTH,month);
		c.set(Calendar.YEAR, year);
		return c;
	}
	
	public static Calendar getInstance(int date, int month, int year) {
		Calendar c = Calendar.getInstance();
		c.set(year, month, date);
		return c;
	}
	
	
	
	public static Calendar getInstance(int date, int month, int year, int hour, int minute, int second) {
		Calendar c = Calendar.getInstance();
		c.set(year, month, date, hour, minute, second);
		return c;
	}
	
	public static String optional(int dmy, String unit) {
		return dmy > 0 ? dmy + " " + unit + " " : " ";
	}

	public static String between(Calendar start, Calendar end) {
		if(start.after(end)) {
			throw new IllegalArgumentException("Start date cannot exceed and date!!!");
		}
		
		long startInMils = start.getTimeInMillis();
		long endInMils = end.getTimeInMillis();
		
		long duration = endInMils - startInMils;
		
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		duration -= TimeUnit.DAYS.toMillis(days);
		
		long hours = TimeUnit.MILLISECONDS.toHours(duration);
		duration -= TimeUnit.HOURS.toMillis(hours);
		
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		duration -= TimeUnit.MINUTES.toMillis(minutes);
		
		long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);
		duration -= TimeUnit.SECONDS.toMillis(seconds);


		
		return days + " days " + hours + " hours " + minutes + " minutes " + seconds + " seconds";
	}
}
