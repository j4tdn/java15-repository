package leet;

public class Problem09 {
	public static void main(String[] args) {
		System.out.println(isPalindrome(11));
	}
	public static boolean isPalindrome(int x) {
	   Integer y = x;
	   String s = y.toString();
	   if(s.startsWith("-")) return false;
	   for(int i = 0, j = s.length() - 1 ; i != j && i<s.length() && j>=0; i++, j--) {
		   if(s.charAt(i) != s.charAt(j)) return false;
	   }
	   return true;
	}
}
