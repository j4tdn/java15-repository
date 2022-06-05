package polymorphism.object;

import javax.swing.JButton;

public class Rectangle extends Shape {
	
	void setBackground() {
		JButton button = new JButton("Button A");
		// click button ==> call event(method)
		
		System.out.println("Shape ==> setBackground...");
	}
}
