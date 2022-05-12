package structure;

//Hoán vị 2 phần tử số nguyên(int, Integer)
public class Ex07 {
	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
//		Case 1 ==> Code in MAIN method; ==> hard code
//		int tmp = a;
//		a = b;
//		b = tmp;
		swap(a , b);

	}
	
	// Case 2 ==> Create a Method for reusable
	private static void swap(int a, int b) {
		int tmp = a;
		a = b;
		b = tmp;
	}
}
