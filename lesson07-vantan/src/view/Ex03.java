package view;

import static utils.Ex03Utils.*;

import java.util.Scanner;

public class Ex03 {
	
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args)  {
		
		int choose = 0;

		System.out.println("1. Xem thời gian hiện tại(dd/MM/yyy HH:mm:ss) ở khu vực bất kỳ.\r\n"
				+ "2. In ngày cuối cùng của tháng hiện tại (dd/MM/yyyy).\r\n"
				+ "3. Xem ngày đầu tiên và cuối cùng của tuần hiện tại.\r\n"
				+ "4. Xem ngày hiện tại đang ở tuần thứ mấy trong năm.\r\n"
				+ "5. Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy.\r\n"
				+ "6. Nhập vào ngày tháng năm sinh. Kiểm tra xem bạn đã sống được bao nhiêu ngày.\r\n"
				+ "0. thoát khỏi chương trình");
		do {
			try {
				System.out.println("HÃY LỤA CHỌN");
				System.out.println("================");
				choose = Integer.parseInt(ip.nextLine());
			} catch (Exception e) {
				e.printStackTrace();
			}
			switch (choose) {
			case 1:
				System.out.println("now: " + getNow());

				break;
			case 2:
				System.out.println("Last day of month: " + getDateTime());

				break;
			case 3:

				System.out.println("First day of week: " + getFirstDayOfWeek());
				System.out.println("Last day of week: " + getLastDayOfWeek());
				break;
			case 4:
				System.out.println("Week of year : " + getWeekOfYear());
				break;
			case 5:
				System.out.println("20 days more : " + get20MoreDays());
				break;
			case 6:
				System.out.println("Days Lived : " + getDaysLived()+ " days");
				break;
			case 0:
				System.out.println("see you again");
			}
		} while (choose != 0);
	}
}
