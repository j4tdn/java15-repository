package view;

import bean.Car;

public class Ex03CarStaticApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car.model = "Audi";
		Car c1 = new Car("#fff");
		Car c2 = new Car("#f00");
		  // c2.model = "MG";

		Car c3 = new Car("#fof");
		Car ck = new Car("###");
		Car c100 = new Car("#000");
		// modified model name
		//   c1.model = "Lexus";

		System.out.println("c1:" + c1);
		System.out.println("c2:" + c2);
		Car.model = "MG";
		System.out.println("c3:" + c3);
		System.out.println("ck:" + ck);
		System.out.println("c100:" + c100);
	}

}
