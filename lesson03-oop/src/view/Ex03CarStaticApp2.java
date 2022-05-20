package view;

import bean.Car;

public class Ex03CarStaticApp2 {
	public static void main(String[] args) {
		Car.model = "Audi";
		Car c1 = new Car("#fff");
		Car c2 = new Car("#f00");
		Car c3 = new Car("#ff0f");
		Car ck = new Car("###");
		Car c100 = new Car("#000");
		
		//c1.model = "MG";
		
		System.out.println("x1: "+c1);
		System.out.println("x2: "+c2);
		//Car.model = "MG";

		System.out.println("x3: "+c3);
		System.out.println("x3: "+ck);
		System.out.println("x3: "+c100);
	}
}
