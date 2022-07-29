package mutable;

public class Ex01MutableVsImmutable {
	public static void main(String[] args) {
		//immutable
		String s = "hello";
		System.out.println("s1 hash: " + System.identityHashCode(s));
		
		s+= " Join";
		System.out.println("s1 hash: " + System.identityHashCode(s));
		
		//mutable will not change address for memory area
		//immutable will change address for memory area
		StringBuilder sb = new StringBuilder("hello");
		System.out.println("sb");
	}
}
