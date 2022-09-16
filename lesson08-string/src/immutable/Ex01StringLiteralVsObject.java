package immutable;

public class Ex01StringLiteralVsObject {
		public static void main(String[] args) {
			
			// immutable bất biến  --> không thê cập nhật giá trị của ô nhớ Heap
			
			String l1 = "Helllo";
			String l2 = "Xin chao";
			String l3 = "Hello";
			hash("l1 hash ", l1);
			hash("l2 hash ", l2);
			hash("l3 hash ", l3);
			
			System.out.println("====================");
			String o1 = new String ("language");
			String o2 = new String ("text");
			String o3 = new String ("language");
			
			hash("o1 hash ", o1);
			hash("o2 hash ", o2);
			hash("o3  hash ", o3);
		}
		private static void hash(String text, String prop) {
			System.out.println(text + " : "+ System.identityHashCode(prop));
		}
}
