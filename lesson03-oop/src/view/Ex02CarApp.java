package view;

import bean.Car;

public class Ex02CarApp {
	public static void main(String[] args) {
		Car c1 = new Car("Black");
		Car c2 = new Car("White");
		Car c3 = new Car("Pink");
		
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		System.out.println("c3: " + c3);
	}
}
