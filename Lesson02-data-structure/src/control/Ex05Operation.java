package control;
import java.util.Random;
public class Ex05Operation {
public static void main(String[] args) {
	//syntax: expression ? statement 1: statement 2
	/*
	 * if(expression){
	 * statement 1;
	 * } else {
	 * statement 1;
	 * }
	 * 
	 * 
	 */
	// Is Odd number
	int number =new Random().nextInt(10);
	boolean isOdd = number % 2 != 0;
			String text =number % 2!=0? "so le":" so chan";
	System.out.println("isOdd:" + isOdd);
	System.out.println("text:" + text);
}
}
