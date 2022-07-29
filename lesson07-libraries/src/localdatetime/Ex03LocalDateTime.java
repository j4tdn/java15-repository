package localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex03LocalDateTime {

	public static void main(String[] args) {
		//LocalDateTime, LocalDate, LocalTime có thể chuyển qua chuyển lại 
		// Period, Duration
		// 
		// 
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		LocalDate date = now.toLocalDate();
		LocalTime time = now.toLocalTime();
		System.out.println(date);
		System.out.println(time);
		
		//date.atTime
		//time.atDate
		
		System.out.println("Format=================================================");
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime parsedDatetime = LocalDateTime.parse("21/07/2022 20:42:16" , df);
		System.out.println("parsedDatetime : " + parsedDatetime );
		
		
	}

}
