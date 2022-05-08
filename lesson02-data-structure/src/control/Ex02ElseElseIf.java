package control;

/**
 * 
 * bad: 0-4.9 good: 8-10 medium: 5-6.4
 * 
 *
 */
public class Ex02ElseElseIf {
	public static void main(String[] args) {
		String level = getLevel(6.8F);
		System.out.println("LEVEL: " + level);
	}	

	private static String getLevel(float score) {
		String result = "";
		if (score < 5) {
			result = "BAD";
		} else if (score < 6.5) {
			result = "MEDIUM";
		} else if (score < 8) {
			result = "MEDIUM";
		} else {
			result = "GOOD";
		}
		return result;
	}
}
