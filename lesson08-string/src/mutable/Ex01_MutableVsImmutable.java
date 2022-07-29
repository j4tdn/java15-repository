package mutable;

public class Ex01_MutableVsImmutable {
	public static void main(String[] args) {
		//immutable
		String s = "hello";
		System.out.println("S1 hash: " + System.identityHashCode(s));
		
		s += "Join";
		System.out.println("s value: " + s);
		System.out.println("S2 hash: " + System.identityHashCode(s));

			//mutable
		StringBuilder sb = new StringBuilder("hello");
		System.out.println("Sb hash: " + System.identityHashCode(sb));

		sb.append(" Teo");
		System.out.println("Sb hash: " + System.identityHashCode(sb));
		System.out.println("sb value: " + sb);

		
	}
}
