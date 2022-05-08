package structure;

import bean.CustomInteger;

// Hoán vị 2 phần tử số nguyên(int, Integer)
public class Ex09 {
	public static void main(String[] args) {
		CustomInteger a = new CustomInteger(12);
		CustomInteger b = new CustomInteger(10);
		Swap(a, b);
		//Case 1
		System.out.println("a: " + a + "," + "b: " + b);
	}
	
	private static void Swap( CustomInteger a, CustomInteger b)
	{
		CustomInteger temp  = a;
		a = b;
		b = temp;
		System.out.println("a: " + a + "," + "b: " + b);

	}
}