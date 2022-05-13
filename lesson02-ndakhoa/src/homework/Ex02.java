package homework;

public class Ex02 {
	public static void main(String[] args) {
		long S = giaothua(4) + giaothua(7) + giaothua(12) + giaothua(18);
		
		System.out.println("giaothua = " + S);

	}

	private static long giaothua(int x) {
		// 4! = 1 *2 *3 *4
		long gt = 1;
		for (int i = 2;i <= x;i++) {
			gt = gt * i;
		}
		return gt;
		
	}
	

}
     // 4! = 4 x 3 x 2 x 1
     // x! = x * (x-1) * (x-2) * (x-3) * ... 
     // x! khác 0

