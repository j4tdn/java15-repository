package structure;

public class Ex08 {
	public static void main(String[] args) {
		int a = 12;
		int b = 36;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		swap(a, b);
		System.out.println("=====AFTER SWAP=====");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
		
	private static void swap(int f, int s) {
		int tmp = f; 
		f = s;
		s = tmp;
		
	
		
	}

}
