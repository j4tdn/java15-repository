package view;


public class Ex01 {
	public static int loopNum(int number) {
		int result = 0;
		while (number > 0) {
			result += Math.pow(number % 10, 2);
			number /= 10;
		}
		return result;
	}

	public static boolean isHappyNum(int number) {
		int tmpNum = number;
		for (int i = 0; i < 100; i++) {
			if (loopNum(tmpNum) == 1) {
				return true;
			}
			tmpNum = loopNum(tmpNum);
		}
		return false;
	}

	public static void main(String[] args) {
		int num = 100;
		System.out.println(isHappyNum(num));
	}
}
