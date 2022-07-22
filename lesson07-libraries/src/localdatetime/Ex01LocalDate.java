package localdatetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import static utils.DateUtils.*;

public class Ex01LocalDate {
	public static void main(String[] args) {
		LocalDate dateStart = LocalDate.now().withMonth(8).withYear(2023).withDayOfYear(10);
		System.out.println("dateStart: " + dateStart);

		LocalDate dateEnd = LocalDate.of(2023, Month.FEBRUARY, 23).plusDays(3);
		
		

		if (dateStart.isAfter(dateEnd)) {
			throw new IllegalArgumentException("date start cannot exceed date end");
		}
		Period period = Period.between(dateStart, dateEnd);
		System.out.println("period: " + period);
		System.out.println("ToString: " + optional(period.getYears(),"years")
										+ optional(period.getMonths(), "months")
										+ optional(period.getDays(), "days"));
		
		System.out.println("===========================");
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yy");
		
		// String --> localtime
		LocalDate date = LocalDate.now();
		System.out.println("formatted: " + df.format(date));
	}
	
}
