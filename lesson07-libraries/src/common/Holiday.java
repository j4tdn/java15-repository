package common;

import java.util.Calendar;

import static utils.DateUtils.*;
import static java.util.Calendar.*;

public class Holiday {
	private Holiday() {
		
	}
	
	public static Calendar[] getVnmseHolidays() {
		return new Calendar[] {
			getTime(1, JANUARY), getTime(2, JANUARY), getTime(3, JANUARY),
			getTime(29, JANUARY), getTime(30, JANUARY), getTime(31, JANUARY),
			
			getTime(1, FEBRUARY), getTime(2, FEBRUARY), getTime(3, FEBRUARY), 
			getTime(4, FEBRUARY), getTime(5, FEBRUARY), getTime(6, FEBRUARY),
			
			getTime(10, APRIL), getTime(11, APRIL), getTime(30, APRIL),
			
			getTime(1, MAY), getTime(2, MAY), getTime(3, MAY),
			
			getTime(1, SEPTEMBER), getTime(2, SEPTEMBER)
		};
	}
}