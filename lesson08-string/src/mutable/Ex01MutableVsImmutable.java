package mutable;

public class Ex01MutableVsImmutable {
	public static void main(String[] args) {
		//immutable 
		String s = "hello";
		System.out.println("s1 hash " + System.identityHashCode(s));
		s += "Join";
		System.out.println(System.identityHashCode(s));
		
		StringBuilder sb = new StringBuilder("hello");
		sb.append(" teo");
		
		System.out.println(sb.reverse());
	}
}
