package logic;

public class CheckSqureNumber {
	public static void main(String[] args) {
		System.out.println(check(64));
	}
	private static boolean check(int Number) {
		float can = (float) Math.sqrt(Number);
		if(Math.ceil(can) == Math.floor(can)) {
			return true;
		}
		return false;
	}
}
