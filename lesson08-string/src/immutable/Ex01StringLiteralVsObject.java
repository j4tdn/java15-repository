package immutable;

public class Ex01StringLiteralVsObject {
	public static void main(String[] args) {
		
		//immutable --> Literal & Object
		//immutable: bất biến là không thể cập nhật giá trị của ô nhớ ở HEAP 
		// khi gán giá trị mới cho biến, nó tạo ra một vùng nhớ trên HEAP và trỏ đến đó
		String l1 = "Hello";
		String l2 = "Xin chao";
		String l3 = "Hello";
		l1 = "Ck Quan";
		//System.out.println("l1 hash: " + System.identityHashCode(l1));
		hash("l1 hash", l1);//
		hash("l2 hash", l2);//
		hash("l3 hash", l3);//
		
		System.out.println("======================");
		String o1 = new String("language");
		String o2 = new String("text");
		String o3 = new String("language");
		hash("o1 hash", o1);//h11
		hash("o2 hash", o2);//h22
		hash("o3 hash", o3);//h33
	}
	private static void hash(String text, String prop) {
		System.out.println(text + ": " + System.identityHashCode(prop));
	}
	
}
