package localdatetime;

import java.util.Calendar;
import java.util.TimeZone;

public class Ex05TimeZone_Locael {
	public static void main(String[] args) {
		TimeZone zone = TimeZone.getTimeZone("Europe/Berlin")
		
		Calendar now = Calendar.getInstance(zone);
		String nowAsString = now.get(Calendar.HOUR_OF_DAY)+ ":"
   + ":"+ now.get(Calendar.MINUTE) 		
     + ":" + now.get(Calendar.SECOND);
		System.out.println("nowAsString :" +nowAsString);
		
	}

}
