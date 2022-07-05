package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex03Formatter { 
	public static void main(String[] args) {
//		date  --> String
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
		Date date = new Date();
		String dateFormat = df.format(date);
		System.out.println("date format: " + dateFormat);
		Calendar c = Calendar.getInstance();
		Date cDate = c.getTime();
		String cDateFormat = df.format(cDate);
		System.out.println("cdate format: "+ cDateFormat);
		
	}

}
