package localdatetime;

import java.util.Calendar;
import java.util.TimeZone;

public class Ex05TimeZone_Locale {
	public static void main(String[] args) {
		// Locale: Khu vực
		// Locale(country,language) -> firstDayOfWeek, currency

		// TimeZone:Múi giờ
		// TimeZone(zoneid) ->time at the zone

		TimeZone zone = TimeZone.getTimeZone("Europe/Berlin");
		Calendar now = Calendar.getInstance(zone);

		String nowAsString = now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE) + ":"
				+ now.get(Calendar.SECOND);
		System.out.println("nowAsString: " + nowAsString);

		// Calendar cal= Calendar.getInstance(zone);
	}
}
