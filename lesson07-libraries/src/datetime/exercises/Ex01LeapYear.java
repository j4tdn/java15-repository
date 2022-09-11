package datetime.exercises;

import utils.DateUtils;

public class Ex01LeapYear {
	public static void main(String[] args) {
		int year = 2022;
		
		System.out.println("is leap year " + DateUtils.isLeapyear(year));
	}
}
