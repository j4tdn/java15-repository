package ex03;
/* 3.1
Kiểm tra 2 chuỗi Strings có phải là đảo ngữ (anagram) của nhau không
2 Strings được gọi là đảo ngữ nếu chúng sử dụng chung các kí tự, không qua tâm các 
kí tự trống, không phân biệt hoa thường. Mỗi kí tự phải có cùng số lượng trong cả 2
*/
public class Ex03 {
	public static void main(String[] args) {
		
		System.out.println("s1 - Word, s2 - DoRw: is Anagram "+ isAnagram("Word", "Drow"));
		System.out.println("s1 - Hellloo, s2 - Hello: is Anagram "+ isAnagram("Hellloo", "Hello"));
		
	}
	private static boolean isAnagram(String s1, String s2) {
		String s3 = "";
		s1 = s1.replaceAll("\\s", "").toLowerCase();
		s2 = s2.replaceAll("\\s", "").toLowerCase();
		for(int i = s1.length() - 1; i >= 0; i--) {
			s3 += s1.charAt(i);
		}
		if(s2.equals(s3)) {
			return true;
		}
		return false;
	}
}
