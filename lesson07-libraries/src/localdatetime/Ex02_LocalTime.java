package localdatetime;

import java.time.Duration;
import java.time.LocalTime;
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
	}
}
