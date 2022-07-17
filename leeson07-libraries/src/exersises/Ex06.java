package exersises;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;

public class Ex06 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(2022, 06, 07);
		int i = 0;
		while (i <= 110) {

			calendar.add(Calendar.DAY_OF_YEAR, 1);
			if (calendar.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY
					&& calendar.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
				i++;
			}
		}
		DateFormat dateFormat = new SimpleDateFormat("dd//MM//yyyy");
		Date date = new Date();
		date = calendar.getTime();
		String calenderFormat = dateFormat.format(date);

		System.out.println(calenderFormat);

	}
}
