package Util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

import common.WeekDayType;

public class DateUtils {
	
	private static GregorianCalendar gc = new GregorianCalendar();
	private static WeekDayType[] weekDays = WeekDayType.values();
	
	private DateUtils() {
		
	}
	public static String optional(long dmy, String unit) {
		return dmy > 0 ? (dmy + " " + unit + " ") : " ";
	}
	public static boolean isHoliday ( Calendar checkedCal, Calendar[] holidays) {
		int dayOfMonth = checkedCal.get(Calendar.DAY_OF_MONTH);
		int month=checkedCal.get(Calendar.MONTH);
		for (Calendar holiday : holidays) {
			if (dayOfMonth == holiday.get(Calendar.DAY_OF_MONTH) && month == holiday.get(Calendar.MONTH)) {
				return true;
			}
		}
		return false;
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
	public static Calendar getInstance(int date, int month, int year, int hour, int minute, int second) {
		Calendar c = Calendar.getInstance();
		c.set(year, month, date, hour,minute,second);
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
	public static String between(Calendar start, Calendar end) {
		if (start.after(end)) {
			throw new IllegalArgumentException("Start date cannot exceed end date !!!");
		}
		//long --> milliseconds --> end - star
		// lấy hiệu đổi ra ngày giờ phút giây
		long startInMils = start.getTimeInMillis();
		long endInMils = end.getTimeInMillis();
		long duration = endInMils - startInMils;
		
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		duration -= TimeUnit.DAYS.toMillis(days);
		
		long hours = TimeUnit.MILLISECONDS.toHours(duration);
		duration -= TimeUnit.HOURS.toMillis(hours);
		
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		duration -= TimeUnit.HOURS.toMillis(minutes);
		
		long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);
		duration -= TimeUnit.HOURS.toMillis(seconds);
		return days + " D " + hours + " H " + minutes + " M " + seconds + " S " ;
	}
}