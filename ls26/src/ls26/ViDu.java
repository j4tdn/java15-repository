package ls26;
import java.util.Scanner;
public class ViDu {
	public static void main(String[] args) {
		int value = 14;
		int othervalue = 20;
		System.out.println("value = " +value);
		value = 20;
		System.out.println("Vaulue = "+ value);
		modify(value);
		System.out.println("value = " +value);
		
		
	
	}
	private static void modify(int input) {
		input = 99;
		System.out.println("input = "+input);
	}

}
