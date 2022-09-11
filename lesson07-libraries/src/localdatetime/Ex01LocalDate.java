package localdatetime;

import static utils.DateUtils.optinal;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
public class Ex01LocalDate {
	public static void main(String[] args) {
		LocalDate dateStar = LocalDate.now().withMonth(8).withYear(2023).withDayOfYear(10);
		System.out.println("date " +dateStar);
		
		
		LocalDate dateEnd = LocalDate.of(2023, Month.FEBRUARY, 22).plusDays(4);
		if(dateStar.isAfter(dateEnd)) {
			throw new IllegalArgumentException("sjkxh");
		}
		
		Period period = Period.between(dateStar, dateEnd);
		System.out.println(optinal(period.getYears(), "years") 
				+ optinal(period.getMonths(), "Months")  
				+optinal(period.getDays(), "Days"));
		System.out.println("===========FORMAT===============");
		DateTimeFormatter df = DateTimeFormatter.ofPattern("EEEE dd/MM/yyyy");
		LocalDate date = LocalDate.now();
		System.out.println("formated " +df.format(date));
		
	}
	
}
