package exersisesdatetime;

import java.util.Calendar;

import utils.DateUtils;

public class Ex07DatingTime {
	public static void main(String[] args) {
		Calendar start = DateUtils.getInstance(20, Calendar.APRIL, 2020, 10, 20, 30);
		Calendar now = Calendar.getInstance();
		String duration = DateUtils.between(start, now);
		System.out.println(duration);
	}

}
