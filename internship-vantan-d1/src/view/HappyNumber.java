package view;

public class HappyNumber {
	public static void main(String[] args) {
		System.out.println(isHappyNumber(9));
	}

	private static boolean isHappyNumber(int num) {
		
		while (true) {
			int sum = 0;
			while (num > 0) {
				int temp = 0;
				temp = num % 10;
				num /= 10;
				sum += temp * temp;

			}
			if(sum == 1) {
				return true;
			}else if(sum == 4) {
				break;
			}else {
				num = sum;
			}
		}
		return false;
	}
}
