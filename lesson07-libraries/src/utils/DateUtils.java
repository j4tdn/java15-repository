package utils;

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
		// TODO Auto-generated constructor stub
	}

	public static String optional(long dmy, String unit) {
		return dmy > 0 ? dmy + " " + unit + " " : " ";
	}

	public static boolean isHoliday(Calendar checkedCal, Calendar[] holidays) {
		int dayOfMonth = checkedCal.get(Calendar.DAY_OF_MONTH);
		int month = checkedCal.get(Calendar.MONTH);
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

	public static Calendar getInstance(int date, int month, int year, int hour, int minute, int second) {
		Calendar c = Calendar.getInstance();
		// x day
		c.set(Calendar.DAY_OF_MONTH, date);
		c.set(Calendar.MONTH, month);
		c.set(Calendar.YEAR, year);
		c.set(Calendar.HOUR, hour);
		c.set(Calendar.MINUTE, minute);
		c.set(Calendar.SECOND, second);
		return c;
	}

	public static Calendar getTime(int date, int month) {
		Calendar c = Calendar.getInstance();
		// x day
		c.set(Calendar.MONTH, month);
		c.set(Calendar.DAY_OF_MONTH, date);

		return c;
	}

	public static Calendar getInstance(int month, int year) {
		Calendar c = Calendar.getInstance();
		// x day
		c.set(Calendar.MONTH, month);
		c.set(Calendar.YEAR, year);
		return c;
	}
	public static Calendar getInstance(int date , int month, int year) {
		Calendar c = Calendar.getInstance();
		// x day
		c.set(Calendar.DATE, date);
		c.set(Calendar.MONTH, month);
		c.set(Calendar.YEAR, year);
		return c;
	}


	public static WeekDayType getWdAsUS(Calendar c) {
		int dowAsInt = c.get(Calendar.DAY_OF_WEEK);
		return weekDays[dowAsInt - 1];
	}

	public static String between(Calendar start, Calendar now) {
		if (start.after(now)) {
			throw new IllegalArgumentException("start date can not exceed date !!!");
		}
		long startInMils = start.getTimeInMillis();
		long nowInMils = now.getTimeInMillis();
		long duration = nowInMils - startInMils;

		long days = TimeUnit.MILLISECONDS.toDays(duration);
		duration -= TimeUnit.DAYS.toMillis(days);
		long hours = TimeUnit.MILLISECONDS.toHours(duration);
		duration -= TimeUnit.HOURS.toMillis(hours);
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		duration -= TimeUnit.MINUTES.toMillis(minutes);
		long second = TimeUnit.MILLISECONDS.toMillis(duration);
		duration -= TimeUnit.SECONDS.toMillis(second);
		return days + "D" + hours + "H" + minutes + "M" + second + "S";
	}
}
