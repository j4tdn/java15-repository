package structure;

import bean.CustomInteger;

public class Ex10 {
	public static void main(String[] args) {
		CustomInteger a = new CustomInteger(12);
		CustomInteger b = new CustomInteger(36);
		
		System.out.println("Hello - Value: " + a);
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		swap(a, b);
		System.out.println("====AFTER SWAP====");
		
		System.out.println("a: " + a); // 12
		System.out.println("b: " + b); // 36
	}
	private static void swap(CustomInteger f, CustomInteger s) {
		int tmp = f.value; // tmp=12, fv=12
		f.value = s.value; // fv=36, sv=36
		s.value = tmp; // sv=12
		//f=36
	}

}
