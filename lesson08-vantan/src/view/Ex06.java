package view;

public class Ex06 {
	public static void main(String[] args) {
		String numbersAsString = "123456789101112131415161718192021222232425262728293031323334353637383940";
		System.out.println(getCharacter(numbersAsString, 30));
		//c�ch 2 nhanh v� ch�nh x�c h�n
	}
	private static char getCharacter(String s, int k) {
		return s.charAt(k-1);
	}
}
