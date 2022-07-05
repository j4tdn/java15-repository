package datetime;

import java.util.Calendar;
import java.util.Date;

public class Ex01CodeDemo {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("date: " + date);
		
		Date dateWithMilliseconds = new Date(24*60*60*1000);
		 System.out.println("dateWithMilliseconds : " + dateWithMilliseconds);
		 
		 System.out.println("===========================");
		 Calendar c =  Calendar.getInstance();
		 System.out.println("now" + c);
		 Calendar cWithTTime = Calendar.getInstance();
		 cWithTTime.set(2025, Calendar.AUGUST, 19);
		
		 cWithTTime.set(Calendar.MONTH, Calendar.JANUARY);
		 cWithTTime.set(Calendar.YEAR, 2022);
		 cWithTTime.add(Calendar.DAY_OF_MONTH, 6);
		 System.out.println("cWithTTime:" + cWithTTime);

	}

}
