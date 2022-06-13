package baitaplogic;

public class TongCacSo {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 4; i++) {
			sum += sum(i);
		}
		System.out.println(sum);
	}
	private static int sum(int n) {
		
		int sum = 1;
		
		
		for (int i = 1; i <= n; i++) {
			
			sum = sum * i;

					
		}
		return sum;
	}
}
