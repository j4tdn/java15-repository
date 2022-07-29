package mutable;

public class Ex01MutableVsImmutable {
	public static void main(String[] args) {
		//immutable
		String s = "hello";
		System.out.println("s1 hash: " + System.identityHashCode(s));
		
		s += "Join";
		System.out.println("s2 hash: " + System.identityHashCode(s));
		System.out.println("=======================================");
		
		//mutable
		StringBuilder sb = new StringBuilder("hello");
		System.out.println("sb1 hash: " + System.identityHashCode(sb));
		sb.append(" Teo ");
		System.out.println("sb value: " + sb);
		System.out.println("sb2 hash: " + System.identityHashCode(sb));
	}
}
