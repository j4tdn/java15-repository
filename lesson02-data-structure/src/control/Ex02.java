package control;

public class Ex02 {

	public static void main(String[] args) {
		String level = getLevel(8.2f);
		System.out.println("Level: "+ level);
	}
	private static String getLevel(float score) {
		String result = "";
		if(score < 5) {
			result ="BAD";
			
		}
		else if (score < 6.5) {
			result = "Medium";
		}
		else if (score < 8) {
			result = "Pretty good";
		}
		else {
			result = "Good";
		}
		return result;
	}
}
