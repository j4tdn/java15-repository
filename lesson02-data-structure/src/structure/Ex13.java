package structure;

public abstract class Ex13 {

	public static void main(String[] args) {
		Integer a = 5;
		System.out.println("a1 hash: "+ System.identityHashCode(a));
		a =15;
		System.out.println("a2 hash: "+ System.identityHashCode(a));
		System.out.println("a value: "+ a);

		// TODO Auto-generated method stub
		String s1 = "hello";
		String s2 = "welcom";
		
		String s3 = "hello";
		System.out.println("s2 hash: "+ System.identityHashCode(s1));
		System.out.println("s2 hash: "+ System.identityHashCode(s2));
		System.out.println("s3 hash: "+ System.identityHashCode(s3));

		
		String o1 = new String("hello");
		String o2 = new String ("welcom");
		String o3 = new String ("welcom");
		System.out.println("o1 hash: "+ System.identityHashCode(o1));
		System.out.println("o1 hash: "+ System.identityHashCode(o2));
		System.out.println("o1 hash: "+ System.identityHashCode(o3));

	}

}
