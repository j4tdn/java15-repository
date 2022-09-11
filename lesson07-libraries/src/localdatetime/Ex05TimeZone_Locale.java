package localdatetime;

import java.util.Calendar;
import java.util.Iterator;
import java.util.TimeZone;

public class Ex05TimeZone_Locale {
	public static void main(String[] args) {
		//Locale: khu vuc
		//+Locale(country, languege)-->first day of week, currency
		
		
		//TimeZone : mui gio
		//TimeZone(zoneID)
		
//		String[] zoneIds = TimeZone.getAvailableIDs();
//		for (String zoneId : zoneIds) {
//			System.out.println(zoneId);
//		}
		
		TimeZone zone = TimeZone.getTimeZone("Europe/Berlin");
		Calendar now = Calendar.getInstance(zone);
		
		String nowAsString = now.get(Calendar.HOUR_OF_DAY)
				+" " +now.get(Calendar.MINUTE)
				+ " "+ now.get(Calendar.SECOND);
		
		System.out.println("Berlin time " + nowAsString);
		
	}
}
