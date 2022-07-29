package datetime.exercises;

import java.util.Calendar;
/*
 * Hôm nay ngày 07/06/2022. Nhóm A nhận được dự án từ khách hàng B. 
 Yêu cầu thực hiện các chức năng của dự án trong vòng 110 ngày. 
 Biết rằng Thứ 7, Chủ nhật được xem như ngày nghỉ nên không tính vào trong thời gian thực hiện 110 ngày, 
 không tính các ngày nghỉ lễ theo luật quốc gia của nhóm phát triển dự án. 
 Hỏi ngày mấy nhóm A sẽ phải bàn giao sản phẩm cho khách hàng B.
 * */
public class Ex06FindDeadlineDate {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		//cal.set(2022, 07, 08);
		int i = 0;
		while(i <= 110) {
			
			cal.add(Calendar.DAY_OF_YEAR, 1);
			//if(calendar.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY) {
				
			}
		}
	}

