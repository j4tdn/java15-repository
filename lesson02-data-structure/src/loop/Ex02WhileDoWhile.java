package loop;

import java.awt.AWTException;

public class Ex02WhileDoWhile {
	public static void main(String[] args) throws AWTException {
		int n = 6;
		int i = 0;
		while(true) {
			System.out.print(i + " ");
			i += 2;
			if(i == n) {
				break;
			}
		}
		
		System.out.println("Finished");
		
	}
}
