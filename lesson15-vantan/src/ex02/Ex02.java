package ex02;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Ex02 {
	public static void main(String[] args) {
		Map<Character, Integer> map = new HashMap<>();
		List<Character> result = new ArrayList<>();
		String sque = "asdhjasdgkasdgkj";
		for (int i = 1; i < sque.length(); i++) {
			if(map.containsKey(sque.charAt(i))) {
				int count = map.get(sque.charAt(i));
				count++;
				map.put(sque.charAt(i), count);
				
			}
			else {
				map.put(sque.charAt(i), 1);
			}
			
		}	

	}
	
//	private static List<Character> findChar(String sque){
//		Map<Character, Integer> map = new HashMap<>();
//		List<Character> result = new ArrayList<>();
//		
//		for (int i = 1; i < sque.length(); i++) {
//			if(map.containsKey(sque.charAt(i))) {
//				int count = map.get(sque.charAt(i));
//				count++;
//				map.put(sque.charAt(i), count);
//				
//			}
//			else {
//				map.put(sque.charAt(i), 1);
//			}
//			
//		}		
//		
//	}
//	private static List<Character> findChar(String sque){
//		List<Character> ch = new ArrayList<>();
//		for (int i = 0; i < sque.length(); i++) {
//			ch.add(sque.charAt(i));			
//		}
//		ch.sort((c1, c2) -> c1.compareTo(c2));
//		for(int i = 1; i < ch.size();i++) {
//			int count = 1;
//			if(ch.get(i).equals(ch.get(i-1))) {
//				count++;
//			}
//		}
//	}
}
