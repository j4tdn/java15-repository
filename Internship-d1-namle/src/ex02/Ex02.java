package ex02;

public class Ex02 {
	
	public static void main(String[] args) {
		
		System.out.println("=====");
		boolean check = checkHappyNumber(19);
		System.out.println(check);
	}
	
	public static boolean checkHappyNumber(int number)
	{
		// toorng binh phuong 19 
	
			if(number < 0)
			{
				return false;
			}
		while (true) {
			int sum = 0;
			for (;number != 0;number /= 10) {
				int temp = 0;
				temp = number % 10;
				
//				sum += Math.pow(number, 2);
				sum += temp * temp;

			}
			if(sum == 1) { // 1
				return true;
			}else if(sum == 4) {
				break;
			}else {
				number = sum;
			}
		}
		return false;
	}
}
