package loop;

public class Ex02_While_DoWhile {
	public static void main(String[] args) {
		int n = 6;
		int i = 0;
		while (i < n) {
			System.out.print(i + " ");
			i+=2;
		}
		System.out.println();
		System.out.println("i = " + i);
		while(true) {
			System.out.println(i + " ");
			if(i == n) {
				break;
			}
		}
		System.out.println("Finished");
		
		
		int m = 8;
		int k = 0;
		do {
			System.out.println(k + " ");
			k++;
			if(k >= m) {
				break;
			}
		} while(true);
		
		
	}
}
