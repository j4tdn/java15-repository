package ex03;

public class Ex03HappyNumber {
	public static void main(String[] args) {
		int input = 68;
		if(isHappyNum(input)) {
			System.out.println("Number is happy number");
		} else {
			System.out.println("Number is not happy number");
		}
	}

	public static int calSquaredNum(int number) {
		int result = 0;
		while (number > 0) {
			result += Math.pow(number % 10, 2);
			number /= 10;
		}
		return result;
	}

	public static boolean isHappyNum(int number) {
		int currentNum= number;
		for (int round = 0; round < 100; round++) {
			if (calSquaredNum(currentNum) == 1) {
				return true;
			}
			currentNum = calSquaredNum(currentNum);
		}
		return false;
	}

}
