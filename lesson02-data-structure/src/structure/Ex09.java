package structure;

public class Ex09 {
	public static void main(String[] args) {
		Integer a = 5, b = 7;
		swap(a, b);
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
	
	private static void swap(Integer c, Integer d) {
		Integer tmp = c;
		c = d;
		d = tmp;
	}
}
