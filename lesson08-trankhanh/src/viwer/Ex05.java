package viwer;

public class Ex05 {
	public static void main(String[] args) {
		String s1 = "s1: ABCEDEABCEDFGKKK";
		String s2 = "s2: ABCEDCBBCEDFGKK";

		System.out.println("Chuỗi chung con dài nhất: " + longestsubstring(s1, s2));
	}
	private static String longestsubstring(String s1, String s2) {

		String name = "";
		for(int i = 0; i < s1.length(); i++) {
			for(int j = i + 1; j < s1.length(); j++) {
				if(s2.contains(s1.substring(i, j))) {
					if(name.length() < s1.substring(i, j).length()) {
						name = s1.substring(i, j);
					}
				}
			}
		}
		return name;
	}

	


}
