package localdatetime;

import java.util.Calendar;
import java.util.TimeZone;

public class Ex05TimeZone_Locale {
	public static void main(String[] args) {
		// Locale: khu vực
		// Locale(country, laguage) --> firtDayOfWeek, currency
		
		// Timezone: Múi giờ
		// Timezone(zoneId) --> time at that zone
		
		TimeZone zone = TimeZone.getTimeZone("Europe/Berlin");
		Calendar now = Calendar.getInstance(zone);
		
		String nowAsString = now.get(Calendar.HOUR_OF_DAY) + ":"
				+ now.get(Calendar.MINUTE) + now.get(Calendar.SECOND);
			//Calendar now = Calendar.getInstance(zone);
		
		System.out.println(nowAsString);
		
	}
}
