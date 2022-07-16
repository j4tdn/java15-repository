package localdatetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;


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
	}

	private static String optional(int dmy, String unit) {
		return dmy > 0 ? dmy + " " + unit + " " : " ";
	}
}
