package view;

import bean.Car;

public class Ex02App {
	public static void main(String[] args) {
		Car x1 = new Car("While");
		Car x2 = new Car("Black");
		Car x3 = new Car("Red");
		
		
		

		System.out.println("x1: "+x1 );
		System.out.println("x2: "+x2 );
		System.out.println("x3: "+x3 );
		
		Ex02App.showSt();
		Ex02App ex02 = new Ex02App();
		ex02.hideSt();
// ko có static phải tạo đối tượng mới chấm được
	}
	
	// có static trong phạm  vi thuộc class 
	 private static void showSt() {
		 
	 }
	 private static void hideSt() {
		 
	 }
}
