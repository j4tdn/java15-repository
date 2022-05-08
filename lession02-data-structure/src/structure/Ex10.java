package structure;

import bean.CustomInteger;

// Hoán vị 2 phần tử số nguyên(int, Integer)
public class Ex10 {
	public static void main(String[] args) {
		CustomInteger a = new CustomInteger(12);
		CustomInteger b = new CustomInteger(10);
		Swap(a, b);
		//Case 1
		System.out.println("a: " + a + "," + "b: " + b);
	}
	// CASE 3 ==> Create a ETHOD for reusble with custom class
	private static void Swap( CustomInteger a, CustomInteger b)
	{
		int tmp = a.value;
		a.value = b.value;
		b.value = tmp;
		System.out.println("a: " + a + "," + "b: " + b);

	}
}