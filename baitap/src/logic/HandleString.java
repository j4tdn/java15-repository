package logic;

public class HandleString {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "ollehh";
		System.out.println(isAnagram(s1, s2));
		System.out.println(isAnagram2(s1, s2));
		
				
	}
	private static boolean isAnagram(String first, String second) {
		if(first == null || second == null) {
			return false;
		}
		if(first.length() != second.length()) {
			return false;
		}
		StringBuilder sb = new StringBuilder(second);
		StringBuilder reverse = sb.reverse();
		return first.equals((reverse).toString());
	}
	private static boolean isAnagram2(String first, String second){
		if(first == null || second == null) {
			return false;
		}
		if(first.length() != second.length()) {
			return false;
		}
		int leng = first.length();
		for (int i = 0; i < leng; i++) {
			if(first.charAt(i) != second.charAt(leng - 1 - i)){
				return false;
			}
		}
		return true;
	}
}
