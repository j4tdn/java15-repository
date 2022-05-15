package view;

import bean.Rectangle;

public class Ex01RectApp {
    public static void main(String[] args) {
		Rectangle r1 = new Rectangle(12,4);
		//r1.width = 12;
		//r1.height = 4;
		r1.setWidth(12);
		r1.setHeight(4);
		
		Rectangle r2 = new Rectangle(15,10);
		//r2.width = 15;
		//r2.height = 10;
		r2.setWidth(15);
		r2.setHeight(10);
		
		Rectangle r3 = new Rectangle(12,7);
		
		System.out.println("R3.width: " + r3.getWidth());
		System.out.println(r1);
		System.out.println("r2 ==>" + r2);
	}
}
