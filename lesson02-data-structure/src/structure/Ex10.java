package structure;

import bean.CustomInteger;

//hoán vị 2 phần tử số nguyên(int, Integer)
public class Ex10 {
	public static void main(String[] args) {
		CustomInteger a = new CustomInteger(12);
		CustomInteger b = new CustomInteger(36);
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		swap(a,b);
		System.out.println("====AFTER SWAP====");
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
	}
	
	//case 3 --> create a method for reusable with custom class
	private static void swap(CustomInteger f, CustomInteger s) {
		int tmp = f.value;
		f.value = s.value;
		s.value = tmp;
	}
}
