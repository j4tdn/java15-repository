package localdatetime;

import java.util.Calendar;
import java.util.TimeZone;

public class Ex05TimeZone_Locale {
	
	public static void main(String[] args) {
		//Locale: khu vực
		//+Locale(country, language) --> fisrtDayOfWeek, currency
		
		//TimeZone: Múi giờ
		//TimeZone(zoneID) --> time at that zone
		TimeZone zone = TimeZone.getTimeZone("Europe/Berlin");
		Calendar now =  Calendar.getInstance(zone);
		
		String nowAsString = now.get(Calendar.HOUR_OF_DAY) + " " +now.get(Calendar.MINUTE)
		  +" " + now.get(Calendar.SECOND);
		
		System.out.println("now: " + nowAsString);
		
	}
	
}
