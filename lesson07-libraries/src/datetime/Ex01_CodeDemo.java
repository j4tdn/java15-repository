package datetime;

import java.util.Calendar;
import java.util.Date;

/**
 * Date(java.ulti.Date)
 * Calendar
 * SimpleDateFormat
 * @author Admin
 *
 */
public class Ex01_CodeDemo {
	public static void main(String[] args) {
		//get curent date time
		Date dt = new Date();
		System.out.println("date: " + dt);
		Date dateWithMilliseconds = new Date(24*60*60*1000);
		System.out.println("dwm:" + dateWithMilliseconds);
		System.out.println("===============");
		Calendar c = Calendar.getInstance();
		System.out.println("now: " + c);
		Calendar cWithTime = Calendar.getInstance();
		cWithTime.set(2025,Calendar.AUGUST, 19);
		cWithTime.set(Calendar.MONTH, Calendar.JANUARY);
		cWithTime.set(Calendar.YEAR, 2022);
		cWithTime.add(Calendar.DAY_OF_MONTH, 6);
		System.out.println("now: " + cWithTime);
		System.out.println(cWithTime.get(1));
	}
}
