package view;

import bean.Car;

public class Ex02CarApp {
	public static void main(String[] args) {
		Car x1 = new Car("White");
		Car x2 = new Car("Black");
		Car x3 = new Car("Red");

		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
		System.out.println("x3: " + x3);

		Ex02CarApp.ShowSt();
		
		Ex02CarApp ex02 = new Ex02CarApp();
		ex02.hideSt();
	}
	
	private static void ShowSt() {
		
	}
	
	private void hideSt() {
		
	}
}
