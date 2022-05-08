package structure;


//Hoàn vị (swap) 2 phần tử số nguyên (int, Interger)
public class Ex07 {
	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		//case 1 ==> Code in MAIN method ==> Hard code
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println("a: " + a);
		System.out.println("b: " + b);

	}
}
