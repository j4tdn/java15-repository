package view;

import bean.Rectangle;

public class EX01RectApp {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.setWidth(12);
		r1.setHeight(4);

		Rectangle r2 = new Rectangle();
		r2.setWidth(15);
		r2.setHeight(10);

		Rectangle r3 = new Rectangle(12, 7);

		System.out.println(" r1 : " + r1);
		System.out.println(" r2 : " + r2);
		System.out.println(" r3 : " + r3);
	}
}
