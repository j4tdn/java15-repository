package structure;

// Hoán vị 2 phần tử số nguyên(int, Integer)
public class Ex09 {
	public static void main(String[] args) {
		Integer a = new Integer(12);
		Integer b = 36;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		swap(a, b);
		System.out.println("====AFTER SWAP====");
		
		System.out.println("a: " + a); // 12
		System.out.println("b: " + b); // 36
	}
	
	// CASE 2 ==> Create a METHOD for reusable
	// Integer f = a 12
	// Integer s = b 36 ===> PASS BY VALUE
	private static void swap(Integer f, Integer s) {
		Integer tmp = f;
		f = s;
		s = tmp;
		// f = 36
		// s = 12
		System.out.println("f: " + f);
		System.out.println("s: " + s);
	}
}
