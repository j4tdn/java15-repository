package loop;

public class WhileDoWhilte {
	public static void main(String[] args) {
		// print out numbers less than N
		int n = 6;
		int i = 0;
		while (i < n) {
			System.out.print(i + " ");
			i += 2;
		}
		i = 0;
		System.out.println("Finished");
		while(true) {
			System.out.println(i + " ");
			i += 2;
			//stop condition
			if (i >= n) {
				break;
			}
		}
		int m =8;
		int k = 0;
		do {
			System.out.println(k + " ");
			k++;
			if (k >=m) {
				break;
				
			}
		} while (true);
	}
	
}
