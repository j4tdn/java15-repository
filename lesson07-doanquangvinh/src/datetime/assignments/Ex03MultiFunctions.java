package datetime.assignments;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;


public class Ex03MultiFunctions {
	public static void main(String[] args) {
	    Calendar c = Calendar.getInstance();
	    c.set(Calendar.YEAR, 2022);
	    c.set(Calendar.MONTH, Calendar.JULY);
	  //  int lastDayOfMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
	   // c.set(Calendar.DAY_OF_MONTH, lastDayOfMonth);
	    Date date = c.getTime();
	    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	    System.out.println("last day of month  " + df.format(date));
	    System.out.println("==========================================================");
	    LocalDate ld = LocalDate.now(); // Friday as original date
		System.out.println("First Date: " + ld.with(DayOfWeek.MONDAY) + " -- Last Date: " + ld.with(DayOfWeek.SUNDAY)); 
		System.out.println("===========================================================");
		System.out.println(c.get(Calendar.DAY_OF_MONTH) + " is in the " + c.get(Calendar.WEEK_OF_YEAR) + "week");
		System.out.println("===========================================================");
		LocalDate now = LocalDate.now();
		LocalDate future = LocalDate.now().plusDays(20);
		
		System.out.println("LocalDate before adding days :" + now);
		System.out.println("LocalDate after adding days :" + future);
		System.out.println("The future date after adding days :" + future.getDayOfWeek());
		System.out.println("===========================================================");
		LocalDate dateOfBirth = LocalDate.of(2001, Month.DECEMBER, 11);
		LocalDate present = LocalDate.now();
		Period period = Period.between(dateOfBirth, present);
		System.out.println("Total times when you have lived :" + period);
	}
}
