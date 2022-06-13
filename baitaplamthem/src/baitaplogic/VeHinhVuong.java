package baitaplogic;

public class VeHinhVuong {
	public static void main(String[] args) {
		draw(8, 9);
	}
	private static void draw(int n, int m) {
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < m; j++) {
				System.out.print(" *");
			}
			System.out.print("\n");
		}

	}
}
