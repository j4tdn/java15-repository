package datetime;

import java.util.Calendar;
import java.util.Date;

/*
 * Date(java.util.Date)
 * Calendar
 * SimpleDateFormat
 * 
 * 
 * */
public class Ex01CodeDemo {
	public static void main(String[] args) {
		// get current date time
		Date date = new Date();
		System.out.println(date);
		Date dateWithMillseconds = new Date(20*365*24*60*60*1000);
		System.out.println(dateWithMillseconds);
		
		System.out.println("========================");
		Calendar c = Calendar.getInstance();
		System.out.println("now: " + c);
		
		Calendar cWithTime = Calendar.getInstance();
		cWithTime.set(2025, Calendar.AUGUST, 19);
		cWithTime.set(Calendar.YEAR, 2022);
		cWithTime.set(Calendar.MONTH, Calendar.JANUARY);
		cWithTime.add(Calendar.DAY_OF_MONTH, 6);
		
		System.out.println("cWithTime: " + cWithTime);
	}
	
}
