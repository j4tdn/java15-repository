package localdatetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import static Util.DateUtils.*;
public class Ex01LocalDate {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now().withMonth(8).withYear(2023);
		System.out.println(date);
		
		LocalDate dateStart = LocalDate.now();
		
		LocalDate dateEnd = LocalDate.of(2023, Month.FEBRUARY, 22).plusDays(4);
		
		if (dateStart.isAfter(dateEnd)) {
			throw new IllegalArgumentException(" ngay dau bang ngay cuoi m choi do a");
		}
		Period period = Period.between(dateStart, dateEnd);
		System.out.println("period " + period);
		System.out.println("toString: " + optional(period.getYears(), "years") + optional(period.getMonths(), "months") + optional(period.getDays(), "days"));
	}

	

}
