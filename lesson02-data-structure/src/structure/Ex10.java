package structure;

import bean.CustomInteger;

public class Ex10 {
	public static void main(String[] args) {
		CustomInteger a = new CustomInteger(5);
		CustomInteger b =new CustomInteger(7);
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	
		swap(a,b);
	}

	private static void swap(CustomInteger a, CustomInteger b){
		int f = a.value;
		a.value = b.value;
		b.value = f;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
}
