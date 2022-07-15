package view;

import java.time.YearMonth;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public class Ex03 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int a;
		boolean flag = true;
		Calendar cal = Calendar.getInstance();
		do {
			System.out.println("\n------------------MENU----------------");
			System.out.println("1. Xem thời gian hiện tại(dd/MM/yyy HH:mm:ss) ở khu vực bất kỳ");
			System.out.println("2. In ngày cuối cùng của tháng hiện tại (dd/MM/yyyy)");
			System.out.println("3. Xem ngày đầu tiên và cuối cùng của tuần hiện tại");
			System.out.println("4. Xem ngày hiện tại đang ở tuần thứ mấy trong năm");
			System.out.println("5. Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy");
			System.out.println("6. Nhập vào ngày tháng năm sinh. Kiểm tra xem bạn đã sống được bao nhiêu ngày");
			a = Integer.parseInt(ip.nextLine());
			switch (a) {
			case 1:
				String[] availableTimezones = TimeZone.getAvailableIDs();
				for (String timezone : availableTimezones) {
					System.out.println("Timezone ID = " + timezone);
				}
				System.out.println("Chọn Timezone: ");
				String select = ip.nextLine();

				cal.setTimeZone(TimeZone.getTimeZone(select));
				System.out.println(
						"Thời gian hiện tại của là " + cal.get(Calendar.DATE) + "/" + (cal.get(Calendar.MONTH) + 1)
								+ "/" + cal.get(Calendar.YEAR) + " " + cal.get(Calendar.HOUR_OF_DAY) + "/"
								+ cal.get(Calendar.MINUTE) + "/" + cal.get(Calendar.SECOND));
				break;
			case 2:
				int finalofmonths = cal.getActualMaximum(Calendar.DATE);
				System.out.println("Ngày cuối cùng là: " + finalofmonths);
				break;
			case 3:
				cal.set(Calendar.DAY_OF_WEEK, cal.getFirstDayOfWeek());
				System.out.println("Ngày đầu tiên là: " + (cal.get(Calendar.DATE) + 1));
				System.out.println("Ngày cuối cùng là: " + (cal.get(Calendar.DATE) + 8));
				break;
			case 4:
				int numberofweeks = cal.get(Calendar.WEEK_OF_YEAR);
				System.out.println("Tuần thứ :" + numberofweeks);
				break;
			case 5:
				cal.add(Calendar.DATE, 20);
				int dayafter = cal.get(Calendar.DATE);
				YearMonth yearMonth = YearMonth.of(2022, Calendar.MONTH);
				String dc = yearMonth.atDay(dayafter - 1).getDayOfWeek().name();
				System.out.println("Ngày: " + dayafter);
				System.out.println("Thứ: " + dc);
				break;
			case 6:
				System.out.println("Nhập ngày sinh: ");
				int daybirth = Integer.parseInt(ip.nextLine());
				System.out.println("Nhập tháng sinh: ");
				int monthbirth = Integer.parseInt(ip.nextLine());
				System.out.println("Nhập năm sinh: ");
				int yearbirth = Integer.parseInt(ip.nextLine());
				Calendar start = Utils.getInstance(daybirth, monthbirth, yearbirth);
				String duration = Utils.between(start, cal);
				System.out.println("Số ngày :" + duration);
				break;
			default:
				System.out.println("Thoat");
				flag = false;
				break;
			}
		} while (flag);
	}

}
