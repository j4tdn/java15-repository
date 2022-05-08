package structure;

import bean.CustomInteger;

public class Ex10 {
	public static void main(String[] args) {
		CustomInteger a = new CustomInteger(12);
		CustomInteger b = new CustomInteger(36);
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		swap(a,b);
		System.out.println("===AFTER SWAP===");
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
	private static void swap(CustomInteger f,CustomInteger s) {
		int tmp = f.value;
		f.value = s.value;
		s.value = tmp;
		
		System.out.println("f: " + f);
		System.out.println("s: " + s);
	}
}
