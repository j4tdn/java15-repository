package Control;

public class Ex02IfElseElseIf {
	public static void main(String[] args) {
		String level = getLevel(6.8f);
		System.out.println("LEVEL: "+ level);
	}
	//Validate: 0<= score <= 10
	private static String getLevel(float score) {
		String result ="";
		if (score<5) {
			result = "BAD";
		} else if (score<6.5) {
			result = "MEDIUM";
		} else if (score<8) {
			result = "PRETTY GOOD";
		} else { result = "GOOD"; }
		return result;
	}
}
