package view;

import bean.*;

public class Ex01RectApp {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		//r1.width = 12;
		//r1.height = 4;
		r1.setWidth(12);
		r1.setHeight(4);
		
		Rectangle r2 = new Rectangle();
		//r2.width = 15;
		//r2.height = 10;
		//Rectangle r3=new Rectangle(12,17);

		System.out.println(r1);
		System.out.println(r2);
	//	System.out.println(r3);
	}
}
