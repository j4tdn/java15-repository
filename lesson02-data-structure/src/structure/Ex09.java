package structure;

public class Ex09 {
	public static void main(String[] args) {
		Integer a = 12;
		Integer b = 36;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		swap(a, b);
		System.out.println("===AFTER SWAP===");
		
		Integer tmp = a; // tmp = 5 
		a = b;
		b = tmp;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
	
	private static void swap(Integer a, Integer b) {
		Integer tmp = a;
		a = b;
		b = tmp; 
	}

}
