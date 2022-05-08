package control;
/**
 *  Ex02: Tìm học lực học viên: getLevel(Float point): Level
 *  BAD(0-4.9), GOOD(8-10), 
 *  PRETTY_GOOD(6.5-7.9), MEDIUM(5-6.4)
 *  
 */
public class Ex02IfElseElseIf {
public static void main(String[] args) {
	String level = getLevel(8.2f);
	System.out.println("LEVEL: " + level);
}
// Validate: 0 <= score <= 10
private static String getLevel(float score) {
	String result = "";
	if (score < 5) {
		result = "BAD";
	} else if (score < 6.5) {
		result = "MEDIUM";
	} else if (score < 8) {
		result = "PRETTY_GOOD";
	} else {
		result = "GOOD";
	}
	return result;
	
}
}
