package exercise;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import utils.DateUtils;

public class Ex05 {
	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy E ");

		Calendar c = DateUtils.getInstance(Calendar.AUGUST, 2022);

		int dateInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		for (int day = 1; day <= dateInMonth; day++) {
			c.set(Calendar.DAY_OF_MONTH, day);

			String fommated = df.format(c.getTime());
			
			if(c.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY) {
				System.out.println(fommated);
			}
			
		}
	}
}
