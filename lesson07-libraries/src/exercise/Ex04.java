package exercise;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import utils.DateUtils;

public class Ex04 {
	public static void main(String[] args) {
		DateFormat df=new SimpleDateFormat("dd/MM/yyyy E ");
		
		Calendar c = DateUtils.getInstance(Calendar.AUGUST, 2022);
		
		int dateInMonth=c.getActualMaximum(Calendar.DAY_OF_MONTH);
		for(int day=1; day<=dateInMonth; day++) {
			c.set(Calendar.DAY_OF_MONTH, day);
			
			String fommated=df.format(c.getTime());
			System.out.println(fommated);
		}
		
		System.out.println("===========");
		//8/7/2022
		Calendar now=Calendar.getInstance();
		now.set(2022, Calendar.JULY, 27);
		// FirstDayNumOfWeek=Current_date_number+ firstdayofweek(sundayormonday)- current_week_date
		now .add(Calendar.DAY_OF_MONTH, now.getFirstDayOfWeek()-now.get(Calendar.DAY_OF_WEEK));
		System.out.println("First day of week: "+df.format(now.getTime()));
		
		for(int i=1; i<7; i++) {
			now.set(Calendar.DAY_OF_MONTH, i);
			String fomatted=df.format(now.getTime());
			
			System.out.println(fomatted);
			now.add(Calendar.DAY_OF_MONTH, 1);
		}
	}
}
