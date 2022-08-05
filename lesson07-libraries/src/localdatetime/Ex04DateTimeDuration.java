package localdatetime;

import static utils.DateUtils.optional;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

/*
 A và B quen nhau đã được chừng ấy năm
 Ngày bắt đầu: 20/04/2020 10:20:30
 Kiểm tra xem 2 bạn đã yêu nhau được bao nhiêu
 Năm – Tháng - Ngày – Giờ - Phút - Giây
*/
public class Ex04DateTimeDuration {
	public static void main(String[] args) {
		LocalDateTime datetimeStart = LocalDateTime.of(2020, 8, 15, 10, 22, 16);
		LocalDateTime datetimeEnd =   LocalDateTime.of(2022, 7, 21,  5, 12, 30);
		
		if (datetimeStart.isAfter(datetimeEnd)) {
			throw new IllegalArgumentException("datetimeStart cannot exceed datetimeEnd !!!");
		}
		
		LocalDate dateStart = datetimeStart.toLocalDate();
		LocalTime timeStart = datetimeStart.toLocalTime();
		
		LocalDate dateEnd = datetimeEnd.toLocalDate();
		LocalTime timeEnd = datetimeEnd.toLocalTime();
		
		Period period = Period.between(dateStart, dateEnd);
		Duration duration = Duration.between(timeStart, timeEnd);
		
		if(timeEnd.isBefore(timeStart)) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}
		
		System.out.println(
						  optional(period.getYears(),        "years")
						+ optional(period.getMonths(),       "months")
						+ optional(period.getDays(),         "days "
						+ optional(duration.toHoursPart(),   "hours")
						+ optional(duration.toMinutesPart(), "minutes")
						+ optional(duration.toSecondsPart(), "seconds"))
		);
	}
}
