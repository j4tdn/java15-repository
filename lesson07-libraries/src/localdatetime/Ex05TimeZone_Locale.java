package localdatetime;

import java.util.Calendar;
import java.util.TimeZone;

public class Ex05TimeZone_Locale {
	public static void main(String[] args) {
		// Locale: Khu vực
		//+ Locale(country, language) --> FristDayOfWeek, currency
		
		// TimeZone : múi giờ
		//TimeZone(zoneId) --> time at the Zone
//		 String [] zoneIds = TimeZone.getAvailableIDs();
//		for (String zoneId: zoneIds ) {
//			System.out.println(zoneId);
//		}
		//Calendar now = Calendar.getInstance();
		
		
		//LẤY GIỜ HIỆN TẠI CỦA BERLIN
		TimeZone zone = TimeZone.getTimeZone("Europe/Berlin");
		Calendar now = Calendar.getInstance(zone);
		String nowAsString = now.get(Calendar.HOUR_OF_DAY)
							+ " " + now.get(Calendar.MINUTE)
							+ " " + now.get(Calendar.SECOND);
		System.out.println("now : " + nowAsString);
		
		
}
}
