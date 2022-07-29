package exercise;

import java.util.Calendar;
import java.util.Date;

import utils.DateUtils;
import common.Holiday;

/**
 * Hôm nay ngày 07/06/2022. Nhóm A nhận được dự án từ khách hàng B. Yêu cầu thực
 * hiện các chức năng của dự án trong vòng 110 ngày. Biết rằng Thứ 7, Chủ nhật
 * được xem như ngày nghỉ nên không tính vào trong thời gian thực hiện 110 ngày,
 * không tính các ngày nghỉ lễ theo luật quốc gia của nhóm phát triển dự án. Hỏi
 * ngày mấy nhóm A sẽ phải bàn giao sản phẩm cho khách hàng B.
 */
public class Ex06FindDeadlineDate {
	private static final int BUDGET = 110;

	public static void main(String[] args) {
		Calendar c = DateUtils.getInstance(10, Calendar.JULY,2022);

		int implemetedDates = 0;

		while (implemetedDates < BUDGET) {
			int weekday = c.get(Calendar.DAY_OF_WEEK);
			boolean isDayOff = (weekday == Calendar.SATURDAY || weekday == Calendar.SUNDAY
					||
					DateUtils.isHoliday(c, Holiday.getVnmseHolidays()));
			if (!isDayOff) {
				implemetedDates++;
				if(implemetedDates==BUDGET) {
					break;
				}
			}
			c.add(Calendar.DAY_OF_MONTH, 1);

		}
		System.out.println("Deadline: " + DateUtils.format("dd/MM/yyyy", c));
	}
}
