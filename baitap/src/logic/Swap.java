package logic;

import java.util.HashMap;
import java.util.Map;

public class Swap {
	//private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Map<Character , Integer> map = new HashMap<>();
		String s = "AtgdfYUtfaaaaajhg";
		System.out.println(map.get(s.charAt(0)));
		for(int i = 0; i < s.length(); i++) {
			if(map.containsKey(s.charAt(i))) {
				int tansuat = map.get(s.charAt(i));
				tansuat++;
				map.put(s.charAt(i), tansuat);
			}else {
				map.put(s.charAt(i), 1);
			}
		}
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+ " " + entry.getValue());
		}
	}
}
