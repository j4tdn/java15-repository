package assignment;

public class Ex03 {
    public static void main(String[] args) {
		String input = "Welcome    to JAVA10    class";
		input = input.replaceAll("\\s+", " ");
		System.out.println(input);
		StringBuilder revertString = new StringBuilder(input);		
		System.out.println(revertString.reverse());
		String[] arr = revertString.toString().split(" ");
		String output = "";
		for (int i = arr.length -1; i >= 0; i--) {
			 output += arr[i] +" ";
		}
		System.out.println(output);
		
	}
}
