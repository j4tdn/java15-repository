package structure;

//hoán vị 2 phần tử số nguyên(int, Integer)
public class Ex08 {
	public static void main(String[] args) {
		int a = 12;
		int b = 36;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		swap(a,b);
		System.out.println("====AFTER SWAP====");
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
	}
	
	//case 2 --> create a method for reusable
	private static void swap(int f, int s) {
		int tmp = f;
		f = s;
		s = tmp;
	}
	
}

