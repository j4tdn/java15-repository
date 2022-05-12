package view;

public class Ex02SumFactorial {
	public static void main(String[] args) {
		long a = tinhgiaithua(4) + tinhgiaithua(7) +  tinhgiaithua(12) + tinhgiaithua(18);
		System.out.println("tong la :");
	}
	public static long tinhgiaithua(int n) {
		long gt=1;
		for(int i =1; i<=n; i++) {
			gt*=i;
		}
		return gt;
	}
}
