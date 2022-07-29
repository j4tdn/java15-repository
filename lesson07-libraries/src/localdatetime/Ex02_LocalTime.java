package localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static utils.DateUtils.*;


public class Ex02_LocalTime {
	public static void main(String[] args) {
		  LocalTime timeStart = LocalTime.now()
				  .withHour(10)
				  .withMinute(20);
		  
		  System.out.println(timeStart);
		  LocalTime timeEnd = LocalTime.of(16, 28);
		  System.out.println(timeEnd);
		  
		  Duration dutation = Duration.between(timeStart, timeEnd);
		  System.out.println(dutation);
		  System.out.println("to String: " + optional(dutation.toHoursPart(), "hours ")
		  								   + optional(dutation.toMinutesPart(), "minutes ")
		  								   + optional(dutation.toSecondsPart(), "seconds"));
		  
		  DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm:ss");
			LocalTime time = LocalTime.now();
			System.out.println("formatted: " + df.format(time));
			System.out.println("formatted: " + df.format(timeStart));
			LocalTime parsedTime = LocalTime.parse("15:32:23", df);
			System.out.println(parsedTime);
	}
}
