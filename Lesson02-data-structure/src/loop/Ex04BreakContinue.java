package loop;

public class Ex04BreakContinue {
	public static void main(String[] args) {
         // break , continue
		for (int i = 1; i <= 10 ; i++) {
			if (i == 4) {
				continue; // finish the present loop
			}
			System.out.println(i);
		}
	}
}
