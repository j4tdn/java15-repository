package baitaplogic;

public class SoNguyenTo5ChuSo {
	public static void main(String[] args) {
		System.out.println("Các số nguyên tố có 5 chữ số là: ");
		int count = 0;
		for (int i = 10001; i < 99999; i += 2) {
			if(isPrimeNumber(i)) {
				System.out.println(i + " ");
				count++;
				
			}
		}
		System.out.println("tổng các số nguyên tố có 5 chữ số là : " + count);
	}
	private static boolean isPrimeNumber(int n) {
		if(n < 2) {
			return false;
		}
		for (int i = 2; i < Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
