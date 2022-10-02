package ex02;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

/**
 * 
 * B1. Nhập tuổi hiện tại của bạn
 * B2. Nhập thời gian đã ngủ trong ngày (giờ-phút)
 * B3. Nhập thời gian bắt đầu ngủ
 * B4. In ra thời gian bạn nên thức dậy để có một sức khỏe tốt
 */
public class Ex02 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập tuổi của bạn: ");
		int age = ip.nextInt();
	System.out.println("Thời gian đã ngủ: ");
	System.out.print("- Giờ: ");
	int hour = ip.nextInt();
	System.out.print("- Phút: ");
	int minute = ip.nextInt();
	LocalTime lc = LocalTime.of(hour, minute);
	System.out.println("Thời gian bắt đầu ngủ:");
	System.out.print("- Giờ: ");
	int startHour = ip.nextInt();
	System.out.print("- Phút: ");
	int StartMinute = ip.nextInt();
	LocalTime startSleptTime = LocalTime.of(startHour, StartMinute);
	long duration = 0;
	duration = Duration.between(lc, LocalTime.of(8, 0)).toMinutes();
	LocalTime lcc = null;
	lcc = startSleptTime.plusHours(duration / 60).plusMinutes(duration % 60);
	System.out.println(lcc);
	
	
	}
}
