package localdatetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Locale;import javax.xml.stream.events.EndDocument;

public class Ex01LocalDate {
	public static void main(String[] args) {
		LocalDate dateStart=LocalDate.now().withMonth(8).withYear(2023).withDayOfYear(10);
		System.out.println(dateStart); // 2022-07-10
		
		LocalDate dateEnd=LocalDate.of(2023, Month.FEBRUARY, 22).plusDays(4);
		System.out.println(dateEnd);
		if(dateStart.isAfter(dateEnd)) {
			throw new IllegalArgumentException("date start can not exceed date end");
		}
		
		Period period=Period.between(dateStart, dateEnd);
		System.out.println("Period: " +period);
		System.out.println("toString: "
				+optional(period.getYears()," years ")
				+optional(period.getMonths()," months ")
				+optional(period.getDays()," days ")
				
				
				);
		
		
		
		
	}
	public static String optional(int dmy, String unit) {
		return dmy>0 ?(dmy+ " " + unit + " ") :" ";
	}
}
