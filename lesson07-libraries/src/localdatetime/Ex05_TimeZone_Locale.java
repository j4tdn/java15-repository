package localdatetime;

import java.util.Calendar;
import java.util.TimeZone;

public class Ex05_TimeZone_Locale {
	public static void main(String[] args) {
		//Locale: Khu vực
		//Locale(country, language) --> firstDayOfWeek, currency;
		
		
		
		//TimeZone
	TimeZone zone =TimeZone.getTimeZone("Europe/Berlin");
	Calendar now = Calendar.getInstance(zone);
	
	String nowAsString = now.get(Calendar.HOUR_OF_DAY)
			+ ": " + now.get(Calendar.MINUTE)
			+ ": " + now.get(Calendar.SECOND);
	
	System.out.println("now: " + nowAsString);
			
	}
}
