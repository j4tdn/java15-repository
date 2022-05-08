package structure;


//Hoàn vị (swap) 2 phần tử số nguyên (int, Interger)
public class Ex08 {
	public static void main(String[] args) {
		int a = 12;
		int b = 36;
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
		private static void swap(int f, int s){
			int tpm = f;
			f = s;
			s = tpm;
		}
	}
