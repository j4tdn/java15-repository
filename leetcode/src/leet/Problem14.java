package leet;

public class Problem14 {
	public static void main(String[] args) {
		String[] strs = {"abca","aba","aaab"};
		System.out.println(longestCommonPrefix(strs));
	}
	public static String longestCommonPrefix(String[] strs) {
		String s = "";
		for(int i = 0; i<strs[0].length();i++) {
			s = strs[0].substring(0,i+1);
			for(int j = 1; j < strs.length; j++) {
				if(!strs[j].startsWith(s)) {
					if(i==0) return "";
					return s.substring(0,i);
				}

			}
		}
		return s;
	}
}
