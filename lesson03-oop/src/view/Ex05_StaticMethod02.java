package view;

public class Ex05_StaticMethod02 {
	private int a;
	private int b;
	public Ex05_StaticMethod02(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public static void main(String[] args) {
		Ex05_StaticMethod02 o1 = new Ex05_StaticMethod02(7,2);
		Ex05_StaticMethod02 o2 = new Ex05_StaticMethod02(7,4);
		System.out.println(o1.sub());
		System.out.println(o2.sub());
	}
	private int sub() {
		return a - b;
	}
}
