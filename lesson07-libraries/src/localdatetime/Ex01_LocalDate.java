package localdatetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import static utils.DateUtils.*;
public class Ex01_LocalDate {
	public static void main(String[] args) {
		LocalDate dateStart = LocalDate.now().withMonth(8).withYear(2023).withDayOfYear(10);
		System.out.println(dateStart);
		LocalDate dateEnd = LocalDate.of(2023, Month.FEBRUARY, 22).plusDays(4);
		if (dateStart.isAfter(dateEnd)) {
			throw new IllegalArgumentException("date start cannot exceed date end");
		}

		Period period = Period.between(dateStart, dateEnd);
		System.out.println(period);
		System.out.println("toString: " + optional (period.getYears(), "years")
										+ optional(period.getMonths(), "months")
										+ optional(period.getDays(), "days"));
	}
}
