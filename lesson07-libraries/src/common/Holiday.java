package common;

import java.util.Calendar;

import utils.DateUtils;
import utils.DateUtils.*;
import static java.util.Calendar.*;

public class Holiday {
	private Holiday() {

	}

	public static Calendar[] getVNmeseHoliday() {
		return new Calendar[] {

				DateUtils.getTime(1, JANUARY), DateUtils.getTime(2, JANUARY), DateUtils.getTime(3, JANUARY),
				DateUtils.getTime(29, JANUARY), DateUtils.getTime(30, JANUARY), DateUtils.getTime(31, JANUARY),

				DateUtils.getTime(1, FEBRUARY), DateUtils.getTime(2, FEBRUARY), DateUtils.getTime(3, FEBRUARY),
				DateUtils.getTime(4, FEBRUARY), DateUtils.getTime(5, FEBRUARY), DateUtils.getTime(6, FEBRUARY),

				DateUtils.getTime(10, APRIL), DateUtils.getTime(11, APRIL), DateUtils.getTime(30, APRIL),

				DateUtils.getTime(1, MAY), DateUtils.getTime(2, MAY), DateUtils.getTime(3, MAY),

				DateUtils.getTime(1, SEPTEMBER), DateUtils.getTime(2, SEPTEMBER) };
	}
}
