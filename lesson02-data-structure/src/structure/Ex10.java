package structure;

public class Ex10 {
	public static void main(String[] args) {
		CustomInteger a = new CustomInteger(12);
		CustomInteger b = new CustomInteger(36);
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		swap(a, b);
		System.out.println("===After swap===");
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		// Case 3 ==> Create a method for reusable with custom class
		// CustomInteger f = a 12
		// CustomInteger s = b 36 ===> Pass by value
	}
	
	private static void swap(CustomInteger f, CustomInteger s) {
		int tmp = f.value; // tmp = 12. fv = 12
		f.value = s.value; // fv = 36, sv = 36
		s.value = tmp; //sv = 12
		
		System.out.println("f: " + f);
		System.out.println("s: " + s);
	}
}
