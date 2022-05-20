package view;

import bean.Rectangle;

public class Ex01RectApp {
	public static void main(String args[]) {
		Rectangle r1 = new Rectangle();
		r1.width = 12;
		r1.height = 4;
		
		Rectangle r2 = new Rectangle();
		r2.width = 15;
		r2.height = 10;
		r2.setWidth(100);
		
		// sau khi có hàm khởi tạo có tham số truyền vào 
		Rectangle r3 = new Rectangle(12, 7);
		
		
		
		System.out.println("r1 ==>" + r1);
		System.out.println("r2 ==>" + r2);
		System.out.println("r3 ==>" + r3);

	}
} 
