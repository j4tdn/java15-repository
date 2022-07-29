package mutable;

public class Ex01MutableVsImmutable {

	public static void main(String[] args) {
		//immutable
		String s = "hello";
		System.out.println("s1 hash: " + System.identityHashCode(s));
		
		s += " Join";
		System.out.println("s2 hash: " + System.identityHashCode(s));
		
		//mutable 
		//tạo một ô nhớ mới để chứa giá trị String
		// cộng thêm vào chuỗi cũ rồi tạo ô nhớ mới để lưu cái vừa tạo
		// Cập nhập lại ô nhớ ban đầu
		StringBuilder sb = new StringBuilder("hello");
		System.out.println("sb1 hash: " + System.identityHashCode(sb));

		sb.append(" Xu");
		System.out.println("value: " + sb);
		System.out.println("sb2 hash: " + System.identityHashCode(sb));

	}

}
