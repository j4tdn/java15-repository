package datetimeexercises;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import utils.DateUtils;

public class Ex04_PrintSpecificDates {
	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		int month = Calendar.AUGUST;
		int year = 2022;
		Calendar c = DateUtils.getIntance(Calendar.AUGUST, 2022);
		int datesInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		for(int day = 1; day <= datesInMonth; day++) {
			c.set(Calendar.DAY_OF_MONTH, day);
			String formatted = df.format(c.getTime()) + " " +  DateUtils.getWdAsVnmese(c);
			System.out.println(formatted);	
		}
		System.out.println("====================");
		c.set(2022, Calendar.AUGUST, 4);
		c.add(Calendar.DAY_OF_MONTH,c.getFirstDayOfWeek() - c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c.getTime());
		for(int i = 1; i <= 7; i++) {
			
			String formatted = df.format(c.getTime()) + " " +  DateUtils.getWdAsVnmese(c);
			System.out.println(formatted);	
			c.add(Calendar.DAY_OF_MONTH, 1);
		}
		
	}
}
