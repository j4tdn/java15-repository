package structure;

public class Ex13 {
		public static void main(String[] args) {
				//HEAP -> constant pool memory
				String s1 = "hello";
				String s2 = "Welcome";
				String s3 = "hello";
				System.out.println("s1 hash" + System.identityHashCode(s1));
				System.out.println("s2 hash" + System.identityHashCode(s2));
				System.out.println("s3 hash" + System.identityHashCode(s3));
				
				//HEAP -> normal memory
				String o1 = new String("hello");
				String o2 = new String("Welcome");
				System.out.println("s1 hash" + System.identityHashCode(o1));
				System.out.println("s2 hash" + System.identityHashCode(o2));
		}
}
