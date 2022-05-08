package control;

/**
 * Tìm học lực học viên: getLevel(float point): level bad(0-4.9), good(8-10), 
 *                                    pretty_good(6.5-7.9), medium(5-6.4)
 * 
 */


public class Ex02IfElseElseIf {
	public static void main(String[] args) {
		String level = getLevel (8.5f);
		System.out.println("LEVEL: " + level);
	}
	
	//validate: 0 <= score <= 10
	private static String getLevel(float score) {
		String result = " ";
		if (score < 5) {
			result = "BAD";
		}else if (score < 6.5) {
			result = "MEDIUM";
		}else if (score < 8) {
			result = "PRETTY_GOOD";
		}else {
			result = "GOOD";
		}
		return result;
	}
}
