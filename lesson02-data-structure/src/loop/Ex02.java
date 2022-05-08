package loop;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n = 6;
			int i = 0;
			while(i<n){
				System.out.print(i+" ");
				i+=2;
			}
			System.out.println("\n==========");
			i = 0;
			while(true) {
				System.out.print(i + " ");
				i+= 2;
				if(i==n) {
					break;
				}
			}
		System.out.println("\nKet thuc");
		int m = 8;
		int k = 0;
		do {
			System.out.print(k+ " ");
			k++;
		} while (k<m);
	}

}
