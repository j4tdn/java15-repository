package view;
/**
 * Bài 4: Hôm nay ngày 07/06/2022. Nhóm A nhận được dự án từ khách hàng B. Yêu cầu thực hiện
các chức năng của dự án trong vòng 110 ngày. Biết rằng Thứ 7, Chủ nhật được xem như ngày nghỉ
nên không tính vào trong thời gian thực hiện 110 ngày, không tính các ngày nghỉ lễ theo luật quốc
gia của nhóm phát triển dự án. Hỏi ngày mấy nhóm A sẽ phải bàn giao sản phẩm cho khách hàng B.
 */

import java.util.Calendar;
import common.Holiday;
import utils.DateUtils;

public class Ex04DeadLine {

	private static final int BUDGET = 110;

	public static void main(String[] args) {
		Calendar c = DateUtils.getInstance(7, Calendar.JUNE, 2022);
		int implemetDates = 0;
		while (true) {
			int weekday = c.get(Calendar.DAY_OF_WEEK);
			boolean isDayOff = (weekday == Calendar.SATURDAY 
					|| weekday == Calendar.SUNDAY
					|| DateUtils.isHoliday(c, Holiday.getVnmseHolidays()));
			if (!isDayOff) {
				implemetDates++;
				if (implemetDates == BUDGET) {
					break;
				}
			}
			c.add(Calendar.DAY_OF_MONTH, 1);
		}
		System.out.println("deadline: " + DateUtils.format("dd/MM/yyyy", c));
	}
}
