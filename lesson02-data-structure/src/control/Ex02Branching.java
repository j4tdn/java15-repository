package control;

public class Ex02Branching {
	public static void main(String[] args) {
		String level = getLevel(6.8f);
		System.out.println("LEVEL: "+level);
	}
	
	private static String getLevel(float score) {
		String result = "";
		if(score < 5) {
			result = "BAD";
		} else if(score < 6.5) {
			result = "MEDIUM";
		} else if(score < 8) {
			result = "PRETTY_GOOD";
		} else {
			result = "GOOD";
		}
		return result;
	}
}
