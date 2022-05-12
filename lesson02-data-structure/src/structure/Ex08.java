package structure;

// Hoán vị 2 phần tử số nguyên(int, Integer)
public class Ex08 {
	public static void main(String[] args) {
		int a = 12;
		int b = 36;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		swap(a, b);
		System.out.println("====AFTER SWAP====");
		
		System.out.println("a: " + a); // 12
		System.out.println("b: " + b); // 36
	}
	
	// CASE 2 ==> Create a METHOD for reusable
	// int f = a 12
	// int s = b 36 ===> PASS BY VALUE
	private static void swap(int f, int s) {
		int tmp = f;
		f = s;
		s = tmp;
		// f = 36
		// s = 12
	}
}
