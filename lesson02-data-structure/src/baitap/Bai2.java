package baitap;

public class Bai2 {
	public static void main(String[] args) {
		long S =4;
		for(int i =4; i<=20; i++) {
			S+=tinhgiaithua(i);
		}
			System.out.println("Tong cac giai thua la: " + S);
	}
	public static long tinhgiaithua(int n) {
		long gt=1;
		for(int i =4; i<=n; i++) {
			gt*=i;
		}
		return gt;
	}
}
