package localdatetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex01LocalDate {
	public static void main(String[] args) {
		// TODO: builder pattern
		LocalDate dateStart = LocalDate.now().withMonth(8).withYear(2023).withDayOfYear(10);

		System.out.println("dateStart: " + dateStart); // 2022-07-10
		LocalDate dateEnd = LocalDate.of(2023, Month.FEBRUARY, 22).plusDays(4);
		if (dateStart.isAfter(dateEnd)) {

			throw new IllegalArgumentException("date start cannot exceed date end");
		}
		Period period = Period.between(dateStart, dateEnd);
		System.out.println("period: " + period);
		System.out.println( "toString: "
				+ optional (period.getYears( ), "years")
				+ optional (period.getMonths ( ),"months" )
				+ optional (period.getDays(),"days" ) ) ;
		
		System.out.println("==========format==========");
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate date = LocalDate.now();
		System.out.println("formated: "+df.format(date));
		
	}
	
	private static String optional (int dmy, String unit) {
		return dmy>0
				? (dmy+ " " + unit + " ")
				: " ";
				
	}
	
}