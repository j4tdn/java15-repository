package datetime.exercises;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import utils.DateUtils;

public class Ex07 {
	public static void main(String[] args) {
		
		Calendar start = DateUtils.getInstance(8, Calendar.JULY, 2022, 21, 10, 0);
		Calendar now = Calendar.getInstance();
		
		String duration = DateUtils.between(start,now);
		System.out.println(duration);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		DateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//		Calendar cal = Calendar.getInstance();
//		
//		Date currentDate = new Date();
//		cal.setTime(new Date());
//		cal.add(Calendar.HOUR, 24);
//		 Date date1 = null;
//		 Date date2 = null;
//		 try {
//		 String startDate= "20/04/2021 10:20:30";
//		 String endDate= simpleDateFormat.format(currentDate);
//		 date1 = simpleDateFormat.parse(startDate);
//		 date2 = simpleDateFormat.parse(endDate); 
//		 long songay = date2.getTime() - date1.getTime();
//		 
//		 long songaycachxa = TimeUnit.MILLISECONDS.toDays(songay);
//		 System.out.println("So ngay khoang cach: " + songaycachxa);
//		 }
//		 catch (Exception e) {
//		 e.printStackTrace();	
//		 }
		 
		 
		
		
		
		
	}
}
