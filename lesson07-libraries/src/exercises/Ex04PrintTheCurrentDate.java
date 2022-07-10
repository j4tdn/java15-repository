package exercises;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import utils.DateUtils;

public class Ex04PrintTheCurrentDate {
	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy E");
		Calendar c = DateUtils.getInStance(Calendar.AUGUST, 2022);
		
		int datesInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);	
		
		for(int day = 1; day <= datesInMonth; day++) {
			c.set(Calendar.DAY_OF_MONTH, day);
			String dateFormat = df.format(c.getTime());
			System.out.println(dateFormat);
		}
		
	}
}
