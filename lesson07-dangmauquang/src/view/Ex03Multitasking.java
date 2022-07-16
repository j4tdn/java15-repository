package view;
/**
  Viết chương trình, mỗi chức năng một phương thức
	1. Xem thời gian hiện tại(dd/MM/yyy HH:mm:ss) ở khu vực bất kỳ.
	2. In ngày cuối cùng của tháng hiện tại (dd/MM/yyyy).
	3. Xem ngày đầu tiên và cuối cùng của tuần hiện tại.
	4. Xem ngày hiện tại đang ở tuần thứ mấy trong năm.
	5. Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy.
	6. Nhập vào ngày tháng năm sinh. Kiểm tra xem bạn đã sống được bao nhiêu ngày.
*/

import java.util.Calendar;
import utils.DateUtils;

public class Ex03Multitasking {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		// 2. In ngày cuối cùng của tháng hiện tại (dd/MM/yyyy).
		int finalDayOfMonth = cal.getActualMaximum(Calendar.DATE);
		System.out.println("Ngày cuối cùng của tháng là: " + finalDayOfMonth);
		
		// 4. Xem ngày hiện tại đang ở tuần thứ mấy trong năm.
		int numberWeekOfYear = cal.get(Calendar.WEEK_OF_YEAR);
		System.out.println("Đây là tuần thứ " + numberWeekOfYear + " trong năm.");
		
		// 6. Nhập vào ngày tháng năm sinh. Kiểm tra xem bạn đã sống được bao nhiêu ngày.
		Calendar start = DateUtils.getInstance(14, 9, 1998);
		String duration = DateUtils.between(start, cal);
		System.out.println("Số ngày đã sống được: " + duration);
	}
}
