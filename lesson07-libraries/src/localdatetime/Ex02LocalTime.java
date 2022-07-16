package localdatetime;

import java.time.Duration;
import java.time.LocalDate;

public class Ex02LocalTime {
	public static void main(String[] args) {
		LocalTime timeStart = LocalTime. now()
				.withHour (10)
				.withMinute(20);
				System. out . printIn( "start time: " + timeStart);
				LocalDate timeEnd = LocalTime. of(16, 28);

				system. out . println("end time: " + timeEnd);
				Duration duration = Duration. between(timeStart, timeEnd) ;
				System. out . println( "duration: " + duration);

				System. out . printIn("toString: "
				+ optional (duration. toHoursPart( ), "hours")
				+ optional (duration. toMinutesPart( ), "minutes")
				+ optional (duration. toSecondsPart( ), "seconds") ) ;

	}
}
