package view;

import bean.Car;

public class Ex02CarApp {
	public static void main(String[] args) {
		Car.model = "audi";
	Car x1 = new Car("White");
	Car x2 = new Car("Black");
	Car x3 = new Car("red");
	
	System.out.println(x1);
	System.out.println(x2);
	System.out.println(x3);
	}
}
