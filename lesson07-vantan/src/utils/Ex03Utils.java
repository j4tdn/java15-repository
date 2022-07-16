package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Ex03Utils {
	private static DateFormat df = new SimpleDateFormat("EEEE dd/MM/yyyy HH:mm:ss a");
	private static Scanner ip = new Scanner(System.in);

	private Ex03Utils() {
	}
	public static String getNow() {
		Calendar c = Calendar.getInstance();
		return df.format(c.getTime());
	}
	

	public static String getDateTime() {
		Calendar c = Calendar.getInstance();
		int lastDayOfMonthAsNum = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		c.set(Calendar.DAY_OF_MONTH, lastDayOfMonthAsNum);
		return df.format(c.getTime());
	}

	public static String getFirstDayOfWeek() {
		Calendar c = Calendar.getInstance(Locale.FRANCE);
		c.add(Calendar.DAY_OF_MONTH, c.getFirstDayOfWeek()-c.get(Calendar.DAY_OF_WEEK));
		
		return df.format(c.getTime());
	}
	public static String getLastDayOfWeek() {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, c.getFirstDayOfWeek()-c.get(Calendar.DAY_OF_WEEK) +7);
		return df.format(c.getTime());
	}
	public static int getWeekOfYear() {
		Calendar c = Calendar.getInstance();
		return c.get(Calendar.WEEK_OF_YEAR);
	}
	public static String get20MoreDays() {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, 20);
		return df.format(c.getTime());
	}
	public static Calendar getBirthday() {
		int year = 0, month = 0, day = 0;
		try {
			System.out.println("Enter Year of Birth");
			 year = Integer.parseInt(ip.nextLine());
			System.out.println("Enter Month of Birth");
			month = Integer.parseInt(ip.nextLine());
			System.out.println("Enter date of Birth");
			day = Integer.parseInt(ip.nextLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
		Calendar c = Calendar.getInstance();
		c.set(year, month-1, day);
		return c;
	}
	public static long getDaysLived()  {
		Calendar birthday = getBirthday();
		Calendar now = Calendar.getInstance();
		
		
		if (birthday.after(now)) {
			throw new IllegalArgumentException("star day cannot exceed now date");
		}
		long birthdayMilis = birthday.getTimeInMillis();
		long nowMilis = now.getTimeInMillis();
		long duration = nowMilis - birthdayMilis;
		
		return TimeUnit.MILLISECONDS.toDays(duration);
	}

}
