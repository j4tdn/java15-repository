package view;

import bean.Car;

public class Ex03CarStaticApp {
	public static void main(String[] args) {
		Car.model = "Audi";
		Car c1 = new Car("#fff");
		Car c2 = new Car("#f00");
		Car c3 = new Car("#f0f");		
		Car ck = new Car("###");		
		Car c100 = new Car("#000");
		// modified model name
		System.out.println("c1: "+c1);
		System.out.println("c2: "+c2);
		
		Car.model = "MG";
		System.out.println("c3: "+c3);
		System.out.println("ck: "+ck);
		System.out.println("c100: "+c100);
	}
	
}
