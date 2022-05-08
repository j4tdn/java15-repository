package structure;

import bean.CustomInteger;

public class Ex10 {
	
	public static void main(String[] args) {
		CustomInteger a = new CustomInteger(12);
		CustomInteger b = new CustomInteger(36);
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		swap(a, b);
		System.out.println("====AFTER SWAP====");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	
	private static void swap(CustomInteger a, CustomInteger b) {
		int tmp = a.value;
		a.value = b.value;
		b.value = tmp;
	}
}
