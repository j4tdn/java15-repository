package view;

import bean.Car;

public class Ex03CarStaticApp {
	public static void main(String[] args) {
	Car.model = "audi";
	Car c1 = new Car("#fff");
	Car c2 = new Car("#f00");
	Car c3 = new Car("#f0f");
	Car c4 = new Car("###");
	System.out.println(c1);
	System.out.println(c2);
	System.out.println(c3);
	System.out.println(c4);
	
	}
}
