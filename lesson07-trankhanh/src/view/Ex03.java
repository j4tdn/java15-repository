package view;

import java.util.concurrent.TimeUnit;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class Ex03 {
	
	public static Calendar getInstance(int date, int month, int year) {
		Calendar c = Calendar.getInstance();
		c.set(year, month, date);
		return c;
	}
	
	public static String between(Calendar start, Calendar end) {
		if(start.after(end)) {
			throw new IllegalArgumentException("illegal !");
		}
		
		
		
		long startInMils = start.getTimeInMillis();
		long endInMils=end.getTimeInMillis();
		
		long duration = endInMils - startInMils; 
		
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		duration -= TimeUnit.DAYS.toMillis(days);
		
		return days +" D ";
	}
	
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		String dateFormat = df.format(date);
		System.out.println("Ngày hiện tại: " + dateFormat);

		
		int finalDayOfMonth = cal.getActualMaximum(Calendar.DATE);
		System.out.println("Ngày cuối cùng của tháng là: " + finalDayOfMonth);
		
	}
}