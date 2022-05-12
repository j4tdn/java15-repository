package structure;

public class Ex08 {
	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		swap(a, b);
		System.out.println("===AFTER SWAP===");
		
		int tmp = a; // tmp = 5 
		a = b;
		b = tmp;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
	
	private static void swap(int a, int b) {
		int tmp = a;
		a = b;
		b = tmp; 
	}

}
