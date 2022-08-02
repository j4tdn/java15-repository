package view;

public class Ex06 {
	public static void main(String[] args) {
		String numbersAsString = "123456789101112131415161718192021222232425262728293031323334353637383940";
		System.out.println(getCharacter(numbersAsString, 30));
		//cách 2 nhanh và chính xác hõn
	}
	private static char getCharacter(String s, int k) {
		return s.charAt(k-1);
	}
}
