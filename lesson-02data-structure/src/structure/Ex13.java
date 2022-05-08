package structure;

public class Ex13 {
public static void main(String[] args) {
	String s = "hello";
	String s1 = "welcome";
	String s2 = "hello";
	System.out.println("s hash: "+System.identityHashCode(s));
	System.out.println("s1 hash: "+System.identityHashCode(s1));
	System.out.println("s2hash: "+System.identityHashCode(s2));
	
	String o = new String("hello");
	String o1 = new String("welcome");
	String o2 = new String("hello");
	
	System.out.println("o hash: "+System.identityHashCode(o));
	System.out.println("o1 hash: "+System.identityHashCode(o1));
	System.out.println("o2 hash: "+System.identityHashCode(o2));

	
}
}
