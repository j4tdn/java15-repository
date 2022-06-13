package baitaplogic;

public class VeHinhVuongRong {
	public static void main(String[] args) {
		draw(19, 8);
	}
	private static void draw(int m, int n) {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if(i == 0 || i == m-1 || j == 0 || j == n-1) {
					System.out.print(" * ");
				}else {
					System.out.print("   ");
				}
				
			}
			System.out.println();
		}
	}
}
