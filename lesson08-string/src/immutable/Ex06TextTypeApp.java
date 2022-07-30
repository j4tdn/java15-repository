package immutable;

public class Ex06TextTypeApp {
	public static void main(String[] args) {
		String s = "aBcD172#@!";
		StringCounter x = ex06(s);
		System.out.println(x);
	}
	
	private static StringCounter ex06(String s) {
		int UpCaseletter = 0, LowerCaseletter = 0, Digitletter = 0;
		for(int i = 0; i<s.length();i++) {
			if(Character.isUpperCase(s.charAt(i))) UpCaseletter++;
			else if(Character.isLowerCase(s.charAt(i))) LowerCaseletter++;
			else Digitletter++;
		}
		StringCounter t= new StringCounter(UpCaseletter,LowerCaseletter,Digitletter);
		return t;
	}
}
