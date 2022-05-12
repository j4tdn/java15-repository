package titv;

import bean.CustomInteger;

public class Testt {
	public static void main(String[] args) {
		CustomInteger a = new CustomInteger(12);
		CustomInteger b = new CustomInteger(23);
		
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		swap(a, b);
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
		
	}
	public static void swap(CustomInteger f, CustomInteger v) {
		int tmp = f.value;
		f.value = v.value;
		v.value = tmp;
	}

}
