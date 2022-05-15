package view;

import bean.Rectangle;

public class Ex01RectApp {
		
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.setWidth(12);
		r1.setHeight(13);
		
		
		Rectangle r2 = new Rectangle();
		r2.setHeight(77);
		r2.setWidth(33);
		
		//r2.width = 15;
		//r2.height = 10;
		
		System.out.println(r1);
		System.out.println(r2);
	}


	
}
