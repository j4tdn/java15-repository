package leet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem20 {
	public static void main(String[] args) {
		System.out.println(isValid("[[[]"));
	}
	 public static boolean isValid(String s) {
	      Map<String, String> mp = new HashMap<>();
	      mp.put("(", ")");
	      mp.put("[", "]");
	      mp.put("{", "}");
	      if(s.length()%2 !=0 ) return false;
	      List<String> str = new ArrayList<>();
	      for(int i = 0; i<s.length(); i++) str.add(s.substring(i, i+1));

	      int n = str.size();
	      for(int i = 0;i < n - 1 ;) {
	    	  if(str.size() > 1 && str.contains(mp.get(str.get(i)))) {
	    		  if(str.get(i).equals("]") == true || str.get(i).equals("}") == true || str.get(i).equals(")") == true) break;
	    		  if(mp.get(str.get(i)).equals(str.get(i+1))){
		    		  str.remove(i+1);str.remove(i);i=0;continue;
		    	  }
		    	  else i++;
	    	  }
	    	  else break;
	    	  
	    	  
	      }
	      if(str.size() == 0) return true;
	      return false;
	 }
}
