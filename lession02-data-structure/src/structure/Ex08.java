package structure;
// Hoán vị 2 phần tử số nguyên(int, Integer)
public class Ex08 {
	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		Swap(1078677864, 9);
		//Case 1
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a: " + a + "," + "b: " + b);
	}
	
	private static void Swap(int a, int b)
	{
		int temp  = a;
		a = b;
		b = temp;
		System.out.println("a: " + a + "," + "b: " + b);

	}
}