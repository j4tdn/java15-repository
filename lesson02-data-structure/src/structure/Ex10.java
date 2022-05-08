package structure;

import bean.CustomInteger;

public class Ex10 {
	public static void main(String[] args) {
		CustomInteger a = new CustomInteger(12);
		CustomInteger b = new CustomInteger(36);
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		swap(a, b);
		System.out.println("swap");
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
	
	private static void swap(CustomInteger c, CustomInteger d) {
		int tmp = c.value;
		c.value = d.value;
		d.value = tmp;
	}
}
//Kieu nguyen thuy neu bien co gia tri ban dau
