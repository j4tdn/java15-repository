package view;

import bean.Car;

public class Ex03CarStaticApp {
	public static void main(String[] args) {
		Car c1 = new Car("#fff");
		Car c2 = new Car("#f0f");
		Car c3 = new Car("###");
		Car ck = new Car("###");
		Car c100 = new Car("#000");
		
		c2.model = "MG";
		
		System.out.println("c1: " +c1);
		System.out.println("c2: " +c2);
		System.out.println("c3: " +c3);
		System.out.println("c1: " +ck);
		System.out.println("c2: " +c100);
		
		showSt();
	}

	private static void showSt() {
		// TODO Auto-generated method stub
		
	}
}
