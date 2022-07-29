package localdatetime;

import static utils.DateUtils.optional;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.swing.text.DateFormatter;

public class Ex04DateTimeDuration {

	public static void main(String[] args) {
		
		LocalDateTime datetimeStart = LocalDateTime.of(2020, 8, 15, 10, 22, 16);
		LocalDateTime datetimeEnd 	= LocalDateTime.of(2022, 7, 21, 20, 12, 30);
		
		if (datetimeStart.isAfter(datetimeEnd)) {
			throw new IllegalArgumentException("ngay bat dau khong duoc trung voi nay ket thuc");
		}
		
		LocalDate dateStart = datetimeStart.toLocalDate();
		LocalDate dateEnd = datetimeEnd.toLocalDate();
		
		LocalTime timeStart = datetimeStart.toLocalTime();
		LocalTime timeEnd = datetimeStart.toLocalTime();
		
		Period period = Period.between(dateStart, dateEnd);
		Duration duration = Duration.between(timeStart, timeEnd);
		if(timeEnd.isBefore(timeStart)) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}
		
		System.out.println(  optional(period.getYears(), 		"years") 
							+ optional(period.getMonths(), 		"months") 
							+ optional(period.getDays(), 		"days")
							+ optional(duration.toHoursPart(), 	"hours") 
							+ optional(duration.toMinutesPart(),"minutes") 
							+ optional(duration.toSecondsPart(),"seconds") );
		
		System.out.println("============================Format============================");
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		 LocalDate date = LocalDate.now();
		 System.out.println("Formatted :" + df.format(date));
		 
		
		
	}

}
