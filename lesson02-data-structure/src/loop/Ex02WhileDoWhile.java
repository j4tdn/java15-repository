package loop;

public class Ex02WhileDoWhile {
	public static void main(String[] args) {
		//print put numbers less than N
		int n = 6;
		int i = 0;
		while(i < n) {
			System.out.print(i + " ");
			i += 2;
		}
		
		System.out.println("\n============");
		i = 0;
		while(true) {
			System.out.print(i + " ");
			i += 2;
			if (i == n) {
				break;
			}
		}
		
		System.out.println("\n");
		
		int m = 8;
		int k = 0;
		do {
			System.out.print(k + " ");
			k++;
		}while(k < 8);
		
		System.out.println("\n");
		k = 0;
		do {
			System.out.print(k + " ");
			k++;
			if(k >= m) {
				break;
			}
		}while(true);
	}
}
