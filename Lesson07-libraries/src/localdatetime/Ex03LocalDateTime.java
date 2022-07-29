package localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex03LocalDateTime {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("now" + now);
		
		LocalDate date = now.toLocalDate();
		LocalTime time = now.toLocalTime();
		System.out.println("date" + date);
		System.out.println("time" + time);
		
		
		System.out.println("====================format===============");
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
		LocalTime time = LocalTime.now();
		System.out.println("formatted: " + df.format(time));  
		
		LocalTime parsedTime = LocalTime.parse("15:30:45",df);
		System.out.println("parsedTime:" + parsedTime);
	}
	
	
}
