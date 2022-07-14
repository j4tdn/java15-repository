 package datetimeexercises;

import java.util.Calendar;

import utils.DateUtils;

public class Ex07_DatingTime {
	public static void main(String[] args) {
		Calendar start = DateUtils.getIntance(13, Calendar.JULY, 2022, 10, 0, 0);
		Calendar now = Calendar.getInstance();
		 
		String duration = DateUtils.between(start, now);
		System.out.println("duration: " + duration);
	}
}
