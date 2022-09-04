package ex04;

import java.util.HashMap;
import java.util.Map;

public class Ex04 {
	public static void main(String[] args) {
		Map<String, Word> dt = new HashMap<>();
		dt = Data();
		dt.put("fire", new Word("fire", "chay", "v", "abc"));
		System.out.println(search(dt, "smartphone"));
		

	}
	private static Word search(Map<String,Word> dt, String text){
		return dt.get(text);
		
	}
	private static	Map<String, Word> Data(){
		Map<String, Word> dt = new HashMap<>();
		dt.put("smartphone", new Word("smartphone", "dien thoai", "n", "abc"));
		dt.put("computer", new Word("computer", "may tinh", "n", "abc"));
		dt.put("run", new Word("run", "chay", "v", "abc"));
		
		return dt;
		
	}
}
