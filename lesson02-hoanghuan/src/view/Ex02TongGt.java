package view;


public class Ex02TongGt {
	public static void main(String[] args) {
		System.out.println("S = "+gt(4)+gt(7)+gt(12)+gt(18));
	}
	public static long gt(int n) {
		long s=1;
		for (int i=2; i<=n; i++ ) {
			s*=i;
		}
		return s;
	}
}
