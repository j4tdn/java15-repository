package datetime.assignments;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.print.attribute.standard.DateTimeAtCompleted;

class _Date{
	public _Date() {
	}
	
	public void Get_CurrentDate(String locale) {
//		final List<String> timeZonesInUS = Stream.of(TimeZone.getAvailableIDs())
//		        .filter(zoneId -> zoneId.startsWith("US")).collect(Collectors.toList());
//		System.out.println(timeZonesInUS);
//		date1.GetCurrentDate(timeZonesInUS.get(0));
//		System.out.println(ZoneId.getAvailableZoneIds());
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss a");
		sdf.setTimeZone(TimeZone.getTimeZone(locale));
		System.out.println("Date in " + locale + " : " + sdf.format(calendar.getTime()));    
	}
	
	public void Get_Last_DateOfMonth() {
		Date today = new Date();  
        Calendar calendar = Calendar.getInstance();  
        calendar.setTime(today);  
        calendar.add(Calendar.MONTH, 1);  
        calendar.set(Calendar.DAY_OF_MONTH, 1);  
        calendar.add(Calendar.DATE, -1);  
        Date lastDayOfMonth = calendar.getTime();  
        DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");  
        System.out.println("Last Day of Month: " + sdf.format(lastDayOfMonth));  
	}
	
	public void Get_First_Last_Day_In_Week() {
		LocalDate ld = LocalDate.now(); // Friday as original date
		System.out.println("First Date: " + ld.with(DayOfWeek.MONDAY) + " -- Last Date: " + ld.with(DayOfWeek.SUNDAY)); 	
	}
	
	public void Get_NoWeekofYear_atCurrentDate(String input) {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date date;
		try {
			date = df.parse(input);
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
		    System.out.println("Number of week in year: " + cal.get(Calendar.WEEK_OF_YEAR));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("error of date");
		}
		
	}
	

	public void Get_tommorowDate(String date, int numbers) {
		Date dt = new Date();
		Calendar c = Calendar.getInstance(); 
		c.setTime(dt); 
		c.add(Calendar.DATE, numbers);
		dt = c.getTime();
		SimpleDateFormat dateFormat = new SimpleDateFormat("EEEEEE, dd/MM/yyyy");
		dateFormat.format(new Date());  
		System.out.println(numbers + " date later is : " + dateFormat.format(dt));
	}
	
	public void NumberDays_Of_Yourlife(String _date) {
		Calendar now = Calendar.getInstance();
		String[] val = _date.split(",");
		String[] Date = val[0].split("/");
		String[] time = val[1].split(":");
		
		Calendar start = Calendar.getInstance();
		start.set(Integer.parseInt(Date[2]), Integer.parseInt(Date[1]), Integer.parseInt(Date[0]), Integer.parseInt(time[0]), Integer.parseInt(time[1]), Integer.parseInt(time[2]));
		if (start.after(now)) {
			throw new IllegalArgumentException("start date can not exceed date !!!");
		}
		long startInMils = start.getTimeInMillis();
		long nowInMils = now.getTimeInMillis();
		long duration = nowInMils - startInMils;

		long days = TimeUnit.MILLISECONDS.toDays(duration);
		duration -= TimeUnit.DAYS.toMillis(days);
		long hours = TimeUnit.MILLISECONDS.toHours(duration);
		duration -= TimeUnit.HOURS.toMillis(hours);
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		duration -= TimeUnit.MINUTES.toMillis(minutes);
		long second = TimeUnit.MILLISECONDS.toMillis(duration);
		duration -= TimeUnit.SECONDS.toMillis(second);
		System.out.println(days + " Days " + hours + " Hours " + minutes + " Mins " + second + " Second");
	}
}

public class Draft {
	public static void main(String[] args) {
		_Date date1 = new _Date();
		date1.Get_CurrentDate("Asia/Singapore");
		date1.Get_Last_DateOfMonth();
		date1.Get_First_Last_Day_In_Week();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  
		String date = dateFormat.format(new Date());  
		date1.Get_NoWeekofYear_atCurrentDate(date);
		date1.Get_tommorowDate(date, 20);
		date1.NumberDays_Of_Yourlife("9/7/2001,12:10:0");
	}
}
