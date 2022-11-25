package view;

public class Bai2 {
	public static void main(String[] args) {
		int input = 16;
		handleHappyNumber(input);
	}
	public static int calculateHappyNumber(int value) {
		int sum = 0;
		while(value != 0)
		{
			sum += Math.pow(value%10, 2);
			value /= 10;
		}
		return sum;
	}
	public static void handleHappyNumber(int input) {
		int value = input;
		int infiniteIndex = 1000000;
		int round = 0;
		while(true)
		{
			round++;
			if(round == infiniteIndex) {
				System.out.println(input + " Khong phai la so hanh phuc");
				return;
			}
			int tempValue = calculateHappyNumber(value);
			if(tempValue == 1)
			{
				System.out.println(input + " la so hanh phuc");
				return;
			}
			value = tempValue;
			
		}
	}
}
