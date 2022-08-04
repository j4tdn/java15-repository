package Ex03;

import java.text.Normalizer;
import java.util.Scanner;

public class UnsignedString {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
	    String s = " ";
	    s = sc.nextLine();
	    

	    String dest = Normalizer.normalize(s, Normalizer.Form.NFD);
	    dest = dest.replaceAll("[^\\p{ASCII}]", "");

	    System.out.println(s);
	    System.out.println(dest);
	}

}
