package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex03_Formatter {
	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("dd/MM/y hh:mm:ss a");
		//date --> string
		
		Date date = new Date();
		System.out.println("df: " + df.format(date));

		//calaedar --. string
		Calendar c = Calendar.getInstance();
		Date cDate = c.getTime();
		String cDateFormat = df.format(cDate);
		System.out.println("cdate format: " + cDateFormat);
		
	}
}
