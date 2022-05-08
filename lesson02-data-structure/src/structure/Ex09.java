package structure;


//Hoàn vị (swap) 2 phần tử số nguyên (int, Interger)
public class Ex09 {
	public static void main(String[] args) {
		Integer a = 12;
		Integer b = 36;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		swap(a,b);
		System.out.println("====AFTER SWAP===");
		
		
		//case 1 ==> Code in MAIN method ==> Hard code
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
		// CASE 2 ==> create a Method for reusable
	// int f = a^ 12
	// int s = b^ 36 ===> PASS BY VALUE
		private static void swap(Integer f, Integer s){
			int tpm = f;
			f = s;
			s = tpm;
			System.out.println("f: " + f );
			System.out.println("s: " + s) ;
		}
	}
