package loop;

public class Ex02WhileDoWhile {
	public static void main(String[] args) {
		// Print out numbers less than N
		int n = 6;
		int i = 0;
//		while (i < n) {
//			System.out.print(i + " ");
//			i += 2;
//		}
//		System.out.println("\nFinished");
		
		while (true) {
			System.out.print(i + " ");
			i += 2;
			
			//stop condition
			if(i >= n) {
				break;
			}
		}
		System.out.println("\nFinished");
		
		int m = 8;
		int k = 0;
		
//		do {
//			System.out.println(k + " ");
//			k++;
//			if(k >= m) {
//				break;
//			}
//		}while(true);
		
		do {
			System.out.println(k + " ");
			k++;
		}while(k < m);
	}
}
