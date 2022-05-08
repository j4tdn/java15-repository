package loop;

public class Ex02WhileDoWhile {
	public static void main(String[] args) {
		// Print out numbers less than N
        int n = 6;
        int i = 0;
        while (true) {
        	System.out.println(i + " ");
        	i+=2;
        	if (i == n) break;
        }
	}
}
