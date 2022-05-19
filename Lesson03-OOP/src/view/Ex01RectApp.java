package view;

import bean.Rectangle;

public class Ex01RectApp {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(12, 4);
		System.out.println("r1 ==> " + r1);
		Rectangle r2 = new Rectangle(0, 0);
		r2.setWidth(15);
		r2.setHeight(10);
		System.out.println("r2 ==>" + r2);
		Rectangle r3 = new Rectangle(12,7);
	    System.out.println("r3 ==> " + r3);	
	}
}
