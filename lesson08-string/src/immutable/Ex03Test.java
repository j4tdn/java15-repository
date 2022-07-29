package immutable;

public class Ex03Test {
	public static void main(String[] args) {
		// ==(address) | equals(value) => primitive & object
		
		String s1="Hello";
		String s2="Bye";
		String s3="Hello";
		
		String o1=new String("Welcome");
		String o2=new String("enjoy");
		String o3=new String("Welcome");
		
		String o4=new String("Bye");
		
		System.out.println("s1==s2: "+ (s1==s2)); //false
		System.out.println("s1==s3: "+ (s1==s3));//true
		System.out.println("s1==s2: "+s1.equals(s2)); // false
		
		System.out.println("o1==o2: "+ (o1==o2)); //false
		System.out.println("o1==o3: "+ (o1==o3));//false
		System.out.println("o1==o2: "+o1.equals(o3)); // true
		
		
		System.out.println("=============================");
		String text01="eabbc23";
		String text02="d2";
		System.out.println("compare: "+ text01.compareTo(text02));// trc nhỏ hơn sau -> trừ nhau
		
		
		
	}
}
