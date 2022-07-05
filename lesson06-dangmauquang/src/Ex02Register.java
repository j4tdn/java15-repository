import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex02Register {
	private static Scanner ip = new Scanner(System.in);
	private static String passWord = null;

	public static void main(String[] args) {
		do {
			System.out.print("Enter password: ");
			try {
				passWord = ip.nextLine();
				checkPassword(passWord);
				System.out.println("Mat khau du tieu chuan");
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (true);
	}

	public static boolean checkPassword(String passWord) {
		String pattern = "/^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[#$@!%&*?])[A-Za-z\\d#$@!%&*?]{8,256}$/";

		if (!Pattern.matches(pattern, passWord)) {
			return false;
		}
		return true;

	}
}
