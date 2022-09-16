package localdatetime;

import java.time.LocalDate;
import java.time.Month;

public class Ex01LacalDate {

	public static void main(String[] args) {
		LocalDate dateStart = LocalDate.now()
		.withMonth(8)
		.withYear(2023)
		.withDayOfYear(10);
		System.out.println("dateStart: "+dateStart);
		
		LocalDate dateEnd = LocalDate.of(2023, Month.FEBRUARY,22)
				.plusDays(4);
	}

}
