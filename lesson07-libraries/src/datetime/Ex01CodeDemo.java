package datetime;

import java.util.Calendar;
import java.util.Date;

/*
 * Date(java.util.Date)
 * Calender
 * SimpleDateFormat
 */

public class Ex01CodeDemo {

	public static void main(String[] args) {
		// lấy ra thời gian hiện tại
		Date date = new Date();

		Date dateWithMilliseconds = new Date(24 * 0 * 60 * 1000);// truyền mili giây vào ngày băt đầu 1970
		System.out.println("date: " + date);
		System.out.println("dateWithMilliseconds: " + dateWithMilliseconds);
		System.out.println("===========================");
		Calendar c = Calendar.getInstance();
		System.out.println("now: " + c);
		
		Calendar cWithTime = Calendar.getInstance();
		cWithTime.set(2025, Calendar.AUGUST, 3);
		cWithTime.set(Calendar.MONTH, Calendar.JULY);
		cWithTime.set(Calendar.YEAR, 2025);
		cWithTime.add(Calendar.DAY_OF_MONTH, 10); // thêm ngày trong tháng của biến cWithTime
		System.out.println("cWithTime: " + cWithTime);
		

	}

}
