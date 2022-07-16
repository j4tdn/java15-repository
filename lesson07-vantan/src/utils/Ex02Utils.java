package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import common.WeekDayType;

public class Ex02Utils {
	private static DateFormat df = new SimpleDateFormat("dd MMMM yyyy");
	private static DateFormat df1 = new SimpleDateFormat("MMMM yyyy");
	private Ex02Utils() {
	}
	public static void getDay(int year, int month, int day) {
		Calendar c = Calendar.getInstance();
		c.set(year, month, day);
		WeekDayType[] weekDayTypes = WeekDayType.values();
		
		int dow = c.get(Calendar.DAY_OF_WEEK);
		WeekDayType dowAsString = weekDayTypes[dow-1];
		System.out.println(df.format(c.getTime())+ " is " +dowAsString);
		int doy = c.get(Calendar.DAY_OF_YEAR);
		int dhl = c.getActualMaximum(Calendar.DAY_OF_YEAR) - doy;
		System.out.println("It is day number " + doy + " of the year, " + dhl + " days left");
		System.out.println("It is " + dowAsString +  " number "
							+c.get(Calendar.WEEK_OF_YEAR) + " out of "
							+c.getActualMaximum(Calendar.WEEK_OF_YEAR)+ " " 
							+c.get(Calendar.YEAR));
		System.out.println("It is " + dowAsString + " number " 
							+c.get(Calendar.WEEK_OF_MONTH) + " out of " 
							+c.getActualMaximum(Calendar.WEEK_OF_MONTH)
							+ " in " + df1.format(c.getTime()));
		System.out.println("Year " +c.get(Calendar.YEAR) + " has "  
							+ c.getActualMaximum(Calendar.DAY_OF_YEAR) + " days");
		System.out.println(df1.format(c.getTime()) + " has " 
							+ c.getActualMaximum(Calendar.DAY_OF_MONTH));
		
	}
}
