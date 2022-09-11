package datetime;

import java.util.Calendar;
import java.util.Date;

/*
 * Date(Java.util.Date)
 * Calendar
 * SimpleDateFormat
 * */
public class Ex01CodeDemo {
	public static void main(String[] args) {
		//get current date time
		Date date = new Date();
		System.out.println("date: " + date);
		Date dateWithMiliseconds = new Date(24*60*60*1000);
		System.out.println("dateWithMiliseconds : " +dateWithMiliseconds);
		
		
		System.out.println("=================");
		
		//Calendar c = Calendar.getInstance();
		//System.out.println("now : " + c);
		
		Calendar cWithtime = Calendar.getInstance();
//		cWithtime.set(2025, Calendar.AUGUST, 19);
//		cWithtime.set(Calendar.MONTH, Calendar.JANUARY);
//		cWithtime.set(Calendar.YEAR, 2022);
		
		cWithtime.add(Calendar.DAY_OF_MONTH, 6);
		Date date1 = cWithtime.getTime();
		System.out.println("cwithtime : " + date1);
		
		
	}
}
