package view;

import java.util.Calendar;

import java.text.SimpleDateFormat;
import static java.util.Calendar.*;

/**
 Hôm nay ngày 07/06/2022. Nhóm A nhận được dự án từ khách hàng B. 
 Yêu cầu thực hiện các chức năng của dự án trong vòng 110 ngày. 
 Biết rằng Thứ 7, Chủ nhật được xem như ngày nghỉ nên không tính vào trong th�?i gian thực hiện 110 ngày, 
 không tính các ngày nghỉ lễ theo luật quốc gia của nhóm phát triển dự án. 
 H�?i ngày mấy nhóm A sẽ phải bàn giao sản phẩm cho khách hàng B.
 */
public class Ex04 {
	
	public static Calendar getInstance(int date, int month, int year) {
		Calendar c = Calendar.getInstance();
		c.set(year, month, date);
		return c;
	}
	
	public static boolean isHoliday(Calendar checkedCal, Calendar[] holidays) {
		int dayOfMonth = checkedCal.get(Calendar.DAY_OF_MONTH);
		int month = checkedCal.get(Calendar.MONTH);
		for (Calendar holiday : holidays) {

			if (dayOfMonth == holiday.get(Calendar.DAY_OF_MONTH)
					&& month == holiday.get(Calendar.MONTH)) {
				return true;
			}
		}
		return false;
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
	
	public static Calendar getTime(int date, int month) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.MONTH, month);
		c.set(Calendar.DAY_OF_MONTH, date);
		return c;
	}


	public static String format(String pattern, Calendar c) {
		return new SimpleDateFormat(pattern).format(c.getTime());
	}
	
	private static final int BUDGET = 110;
	
	public static void main(String[] args) {
		Calendar c = getInstance(7, Calendar.JUNE, 2022);
		int implemetedDates = 0;
		while(true) {
			int weekday = c.get(Calendar.DAY_OF_WEEK);
			boolean isDayOff = (weekday == Calendar.SATURDAY 
				|| weekday == Calendar.SUNDAY)
				||isHoliday(c, getVnmseHolidays());
			if (!isDayOff) {
				implemetedDates++;
				if (implemetedDates == BUDGET) {
					break;
				}
			}
			c.add(Calendar.DAY_OF_MONTH, 1);
		}
		System.out.println("deadline: " + format("dd/MM/yyyy", c));
	}
}