package exersises;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex04 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();

	}

	public static void DayOfMonth(Calendar calendar) {
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		Date date = new Date();
		date = calendar.getTime();
		String cDateFormat = dateFormat.format(date);
		System.out.println(cDateFormat);
	}

}
