package localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex02LocalTime {
	public static void main(String[] args) {
		
		LocalTime timeStart = LocalTime.now()
				.withHour(10)
				.withMinute(20);
		System.out.println("start time: " + timeStart);
		
		LocalTime endTime = LocalTime.of(16,28);
		System.out.println("end time: "+ endTime);
		
		 Duration duration= Duration.between(timeStart, endTime);
		 System.out.println("duration: "+ duration);
		 System.out.println("toString: "+ duration.toHours());
		 
			System.out.println("=================format===================");
			
			DateTimeFormatter df=  DateTimeFormatter.ofPattern("HH:mm:ss");
			
			
			LocalTime time= LocalTime.now();
			System.out.println("formatted: " + df.format(time));// time to string
			
			// string to localtime
			LocalTime parsedTime = LocalTime.parse("15:30:45", df);
			System.out.println("parsedTime: "+ parsedTime);
	}
}
