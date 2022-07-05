package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Ex03Formatter {
	public static void main(String[] args) {
		System.out.println("default locate :" + Locale.getDefault());
		Locale.setDefault(new Locale("vi", "VN"));
		
		DateFormat df = new SimpleDateFormat("dd//MM/yyyy hh:mm:ss a");
		// date --> String
		Date date = new Date();
		String dateFormat = df.format(date);
		System.out.println("date format :" + dateFormat);
		// calendar --> String
		Calendar c = Calendar.getInstance();
		Date cDate = c.getTime();
        String cDateFormat = df.format(cDate);
        System.out.println("cDateFormat :" + cDateFormat);
        
        // slides
        // Sunday = 1 , Monday =2 , --- Saturday = 7
        int weekDay = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(weekDay);
        //FirstDay Of Week
        int fdow = c.getFirstDayOfWeek();
        System.out.println("fdow:" + fdow);
	}
}
