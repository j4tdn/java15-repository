package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

import common.WeekDayType;

public class DateUtils {
	private static GregorianCalendar gc= new GregorianCalendar();
	private static WeekDayType[] weekDays= WeekDayType.values();
	private DateUtils() {
		
	}
	
	public static boolean isHoliday(Calendar checkedCal, Calendar[] holidays) {
		int dayOfMonth= checkedCal.get(Calendar.DAY_OF_MONTH);
		int month=checkedCal.get(Calendar.MONTH);
		for(Calendar holiday:holidays) {
			if(dayOfMonth==holiday.get(Calendar.DAY_OF_MONTH)&& month==holiday.get(Calendar.MONTH)) {
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
	public static Calendar getInstance(int month, int year) {
		Calendar c= Calendar.getInstance();
		c.set(Calendar.MONTH, month);
		c.set(Calendar.YEAR, year);
		return c;
	}
	public static Calendar getTime(int date, int month) {
		Calendar c= Calendar.getInstance();
		c.set(Calendar.MONTH, month);
		c.set(Calendar.DAY_OF_MONTH, date);
		return c;
	}
	public static Calendar getInstance(int date,int month, int year) {
		Calendar c= Calendar.getInstance();
		c.set(year, month, date);
		
		return c;
	}
	public static Calendar getInstance(int date,int month, int year, int hour, int minute, int second) {
		Calendar c= Calendar.getInstance();
		c.set(year, month, date,hour,minute,second);
		
		return c;
	}
	//public static WeekDayType getWdAsVnese(Calendar c) {
	//	int dowAsInt=c.get(Calendar.DAY_OF_WEEK);
		//return weekDays[dowAsInt].toString();
	//}

	public static String between(Calendar start, Calendar end) {
		if(start.after(end)) {
			throw new IllegalArgumentException("Start day can not exceed end date!!!");
		}
		//long-->milliseconds -->end-start
		// milliseconds -> year, month, day, hour, minute, second
		
		long startInMils=start.getTimeInMillis();
		long endInMils=end.getTimeInMillis();
		
		long duration= endInMils-startInMils;//milliseconds
		
		//int days=duration/(1000*60*60*24);
		
		long days=TimeUnit.MILLISECONDS.toDays(duration);
		duration -= TimeUnit.DAYS.toMillis(days);
		
		long hours = TimeUnit.MILLISECONDS.toHours(duration);
		duration -= TimeUnit.HOURS.toMillis(days);
		
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		duration -= TimeUnit.MINUTES.toMillis(minutes); // miliseconds
		
		long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);
		duration -= TimeUnit.SECONDS.toMillis(minutes); // miliseconds
		
		
		
		
		
		return 
		days + "D " +
		hours + "H " 
		+ minutes +"M "
		+ seconds + "S "  ;
	}
}
