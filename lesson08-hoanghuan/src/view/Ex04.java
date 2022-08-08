package view;

public class Ex04 {
	public static void main(String[] args) {
		int m = 75;
		int n = 15;
	}
	public static int nt(int n) {
		int dem = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				dem++;
			}
		}
		if (dem == 2) {
			return 1;
		} else return 0;
	}
	private static int check (int a, int b) {
		int []h = new int[a];
		int []k = new int[b];
		int d = 0;
		for (int j = 0; j <=a; j++) {
			if (nt(j) == 1){
				d++;
				h[d] = j;
			}
		}
	}
}
