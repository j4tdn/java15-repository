package leet;

import java.util.HashMap;
import java.util.Map;

public class Problem13 {
	public static void main(String[] args) {
		System.out.println(romanToInt("LVIII"));
	}
	  public static int romanToInt(String s) {
	      Map<String, Integer> mp = new HashMap<>();
	      String[] str = new String[s.length()];
	      for(int i =0; i< s.length();i++) str[i] = s.substring(i, i+1);
	      mp.put("I", 1);
	      mp.put("V", 5);
	      mp.put("X", 10);
	      mp.put("L", 50);
	      mp.put("C", 100);
	      mp.put("D", 500);
	      mp.put("M", 1000);
	      int sum = 0, tmp = 0, flag = 0;
	      for(int i = 0; i<s.length()-1;i++) {
	    	  if(mp.get(str[i]) < mp.get(str[i+1])) {
	    		  tmp = mp.get(str[i+1]) - mp.get(str[i]);
	    		  if(i == s.length()-2) flag++;
	    		  i++;
	    		  
	    	  }
	    	  else tmp = mp.get(str[i]);
	    	  sum+=tmp;
	    	  tmp=0;
	      }
	      if(flag == 0) sum+=mp.get(str[s.length()-1]);
		  return sum;
	  }
}
