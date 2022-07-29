package localdatetime;

import java.util.Calendar;
import java.util.Iterator;
import java.util.TimeZone;

public class Ex05TimeZone_Locale {
	public static void main(String[] args) {
		// Locale : Area
		// Locale(country , language) --> FirstDayOfWeek , currency
		// TimeZone : Mui gio
		// TimeZone(zoneId) --> Time at that zone
		 TimeZone zone = TimeZone.getTimeZone("Europe/Berlin");
		 Calendar now = Calendar.getInstance(zone);
		 
		 String nowAsString = now.get(Calendar.HOUR_OF_DAY) + "" + now.get(Calendar.MINUTE) + "" + now.get(Calendar.SECOND);
		 System.out.println("now :" + nowAsString);
	}
}
