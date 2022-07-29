package viwer;

public class Ex03 {
	public static void main(String[] args) {
		 String str = "Welcome to JAVA10 class";
		 StringBuilder input1 = new StringBuilder();
		 str = str.replaceAll("\\s+", " ");
		 input1.append(str);
		  input1.reverse();
		  System.out.println(input1);
		 
	}
}
