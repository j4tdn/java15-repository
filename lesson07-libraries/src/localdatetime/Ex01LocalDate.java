package localdatetime;

import java.time.LocalDate;
import java.time.Period;
import static utils.DateUtils.*;

public class Ex01LocalDate {
	public static void main(String[] args) {
		LocalDate dateStart = LocalDate.now().withMonth(8).withYear(2023).withDayOfYear(10);
		System.out.println("Date: " + dateStart);
		LocalDate dateEnd = LocalDate.of(2023, 2, 22).plusDays(4);

		if (dateStart.isAfter(dateEnd)) {
			throw new IllegalArgumentException("date start cannot exceed date end");
		}
		Period period = Period.between(dateStart, dateEnd);
		System.err.println("period: " + period);
		System.out.println("toString: "
				+ optinal(period.getYears(), "years")
				+ optinal(period.getMonths(), "months")
				+ optinal(period.getDays(), "days")
				);
	}
	
	
}
