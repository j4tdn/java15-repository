package structure;

//hoán vị 2 phần tử số nguyên(int, Integer)
public class Ex09 {
	public static void main(String[] args) {
		Integer a = new Integer(12);
		Integer b = new Integer(36);
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		swap(a,b);
		System.out.println("====AFTER SWAP====");
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
	}
	
	//case 2 --> create a method for reusable
	private static void swap(Integer f, Integer s) {
		Integer tmp = f;
		f = s;
		s = tmp;
	}
}
