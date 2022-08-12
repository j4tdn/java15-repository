package exercises;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import utils.DateUtils;

public class Ex05PrintSundayInMonth {
	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Calendar c = DateUtils.getInstance(Calendar.AUGUST, 2022);
		int datesInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);	
		
		for(int day = 1; day <= datesInMonth;) {
			c.set(Calendar.DAY_OF_MONTH, day);
			String dateFormat = df.format(c.getTime()) + " " + DateUtils.getWdAsVnmese(c);
			
			if(c.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				System.out.println(dateFormat);
				day += 7;
				continue;
			}
			day++;
		}
		
	}
}
