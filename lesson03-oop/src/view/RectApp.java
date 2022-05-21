package view;

import bean.Rectangle;

public class RectApp {
	public static void main(String[] args) {
	Rectangle r1 = new Rectangle();
	
//	r1.width = 12;
//	r1.height = 4;
	r1.setWidth(12);
	r1.setHeight(4);
	System.out.println(r1);
	
	Rectangle r3 = new Rectangle(13, 9);
	System.out.println(r3);
	
	}
}
