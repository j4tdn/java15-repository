package view;

import bean.Rectangle;

public class Ex01RectApp {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		//r1.height = 10;
		//r1.width = 11;
		r1.setWidth(11);
		r1.setHeight(10);
		
		Rectangle r2 = new Rectangle();
		//r2.height = 22;
		//r2.width = 0;
		r2.setWidth(0);
		r2.setHeight(22);
		
		Rectangle r3 = new Rectangle(1235, 38473);
		System.out.println();
		
		System.out.println("r1 ==> " + r1);
		System.out.println("r2 ==> " + r2);
		System.out.println("r3 ==> " + r3);
	}
}
