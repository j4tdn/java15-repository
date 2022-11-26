package view;

public class Ex02 {
	public static void main(String[] args) {

		int number = 19;
		int result = number;
		while (result != 1 && result != 4) {
			result = isHappyNumber(result);
		}
		if (result == 1)
			System.out.println(number + " is a happy number");
		
		else if (result == 4)
			System.out.println(number + " is not a happy number");
	}

	public static int isHappyNumber(int number) {
		int rem = 0, sum = 0;
		while (number > 0) {
			rem = number % 10;
			sum = sum + (rem * rem);
			number = number / 10;
		}
		return sum;
	}
}
