package leet;

public class Problem05 {
	public static void main(String[] args) {
		
	}
	public static int ex(String s, int l, int r) {
		while(l>=0 && r<s.length() && s.charAt(r) == s.charAt(l)) {
			l--;r++;
		}
		return r-l+1;
	}
	
}
