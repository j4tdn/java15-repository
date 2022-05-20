package view;

public class Ex05StaticMethod02 {
	private int a;
	private int b;
	
	public Ex05StaticMethod02(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public static void main(String[] args) {
		Ex05StaticMethod02 o1 = new Ex05StaticMethod02(7, 2);
		Ex05StaticMethod02 o2 = new Ex05StaticMethod02(10,4);
		
		System.out.println("o1: " + o1.sub());
		System.out.println("o2: " + o2.sub());
	}
	private int sub() {
		return a + b;
	}
}
