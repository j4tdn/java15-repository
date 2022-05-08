package structure;
// Hoán vị 2 phần tử số nguyên(int, Integer)
public class Ex07 {
	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		
		//Case 1
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a: " + a + "," + "b: " + b);
	}
}
