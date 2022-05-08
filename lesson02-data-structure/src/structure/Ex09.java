package structure;

public class Ex09 {
	public static void main(String[] args) {
		Integer a = 12;
		Integer b = 36;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		swap(a, b);
		
		System.out.println("=====AFTER SWAP=====");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
		
	private static void swap(Integer f, Integer s) {
		Integer tmp = f; 
		f = s;
		s = tmp;
		System.out.println("f: " + f);
		System.out.println("s: " + s);
	
		
	}

}
