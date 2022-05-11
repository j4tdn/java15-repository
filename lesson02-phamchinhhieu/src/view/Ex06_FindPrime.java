package view;

public class Ex06_FindPrime {
	public static void main(String[] args) {
		System.out.println("======TIM SO NGUYEN TO THU 200=======");
		System.out.println();
		System.out.println("So nguyen to thu 200 la: " + FindPrime());
	}

	private static int FindPrime() {
		int number = 2;
		int count = 0; // dem trong for
		int count1 = 0; // dem tu 1->200
		while (count1 != 200) {
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					// System.out.print("i = " + i + " ");
					count++; // neu chia co du thi tang bien dem
					break;
				}

			}
			if (count > 0) {
				number++; // neu chia có du thì tang so de kiem tra
			} else if (count == 0) {
				count1++;
				number++; // neu so do dung thi tang bien dem len 1
							// va tang so de kiem tra so tiep theo

			}
			count = 0; // reset gia tri dem
		}
		return number - 1;
	}
}
