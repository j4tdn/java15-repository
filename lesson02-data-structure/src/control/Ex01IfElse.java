package control;

import java.util.Random;

// kiểm tra một số là chẵn hay lẽ?
// kiểu tra một số có chia hết cho 5 không?
public class Ex01IfElse {
	public static void main(String[] args) {
		Random rd = new Random();
		int number = 3 +rd.nextInt(5);
		System.out.println("number: " + number);
		if(number % 2 == 0) {
			System.out.println(number + " is even number");
		}
		else {
			System.out.println(number + " is odd number");
		}
	if(number % 3 ==0) {
		System.out.println("number again" + number );
	}
	}
}
