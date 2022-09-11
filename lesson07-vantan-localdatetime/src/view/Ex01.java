package view;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.TimeZone;

public class Ex01 {
	public static void main(String[] args) {
//		String[] zoneIds = TimeZone.getAvailableIDs();
//		for (String zoneId : zoneIds) {
//			System.out.println(zoneId);
//		}
		//TimeZone zone = TimeZone.getTimeZone("Europe/Berlin");
		LocalDateTime datetime = LocalDateTime.now(ZoneId.of("Europe/Berlin"));
		System.out.println(datetime);
	}
}
