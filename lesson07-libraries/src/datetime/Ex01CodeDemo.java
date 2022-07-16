package datetime;

import java.util.Calendar;
import java.util.Date;

/**
 * Date(java.util.Date)
 * Calendar
 * SimpleDateFormat
 * @author MSI GL65
 *
 */
public class Ex01CodeDemo {
	public static void main(String[] args) {
        // get current date time
		Date date = new Date();
		System.out.println(date);
		Date dateWithMilliseconds = new Date(24*60*60*1000);
		System.out.println("dateWithMilliseconds :" + dateWithMilliseconds);
		// so mili giay tinh tu ngay 1 thang 1 nam 1970 , hay con goi la the epoch
		// moc thoi gian xu ly lap trinh trong ngay thang name
		System.out.println("=================================================");
		Calendar c = Calendar.getInstance();
		System.out.println("now :" + c);
		
		Calendar cWithTime = Calendar.getInstance();
		cWithTime.set(2025, Calendar.AUGUST, 19);
		//cWithTime.set(Calendar.MONTH, Calendar.JANUARY);
		//cWithTime.set(Calendar.YEAR, 2022);
		//cWithTime.add(Calendar.DAY_OF_MONTH, -6);
		System.out.println("now :" + cWithTime);

	}
}
