package loop;

public class Ex04BreakContinue {
	public static void main(String[] args) {
		// break, continue

		for (int i = 1; i <= 10; i++) {
			if (i == 4) {
				// break: dừng toàn bộ vòng lặp ngay lập tức
				continue; // Kết thúc sớm vòng lặp hiện tại
			}
			System.out.print(i + " ");
		}
	}

}
