package localdatetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import static utils.DateUtils.*;

public class Ex01LocalDate {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now().withMonth(8).withYear(2022).withDayOfYear(10);

		System.out.println("date :" + date);
		LocalDate dateEnd = LocalDate.of(2023, Month.FEBRUARY, 22).plusDays(4);

		if (date.isAfter(dateEnd)) {
			throw new IllegalArgumentException("date start cannot exceed date end ");
		}

		Period period = Period.between(date, dateEnd);
		System.out.println("Period" + period);
		System.out.println("toString : " + optional(period.getYears(), "years")
				+ optional(period.getMonths(), "months" + optional(period.getDays(), " days")));
	}

}
