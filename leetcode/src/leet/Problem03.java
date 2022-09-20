package leet;

import java.util.HashMap;
import java.util.Map;

public class Problem03 {
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("pwwkew"));
	}
	public static int lengthOfLongestSubstring(String s) {
		int res = 0, l=0; String[] str = new String[s.length()];
		Map<String , Integer> mp = new HashMap<>();
		for(int i = 0; i< s.length();i++) str[i] = s.substring(i,i+1);
		for(int i =0; i<s.length();i++) {
			
			if(mp.containsKey(str[i])) {
				while(l<i && str[l].equals(str[i]) == false) {
					mp.remove(str[l]);
					l++;
				}
				l++;
				
			}
			mp.put(str[i], 1);
			res = res < i-l+1 ? i-l+1 : res; 
		}

		return res;
	}
}
