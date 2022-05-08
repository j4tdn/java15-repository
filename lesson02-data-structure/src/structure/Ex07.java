package structure;

//hoán vị 2 phần tử số nguyên(int, Integer)
public class Ex07 {
	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("====AFTER SWAP====");
		//case 1 --> code in main method
		int tmp = a;
		a = b;
		b = tmp;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
	}
}
