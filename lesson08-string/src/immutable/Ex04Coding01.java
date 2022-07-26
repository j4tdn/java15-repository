package immutable;

import javax.sql.rowset.serial.SQLOutputImpl;

public class Ex04Coding01 {
	public static void main(String[] args) {
		
	
	String s = "JAVA15";
	String s1 = "COUSE";
	
	System.out.println( "s1:  " +s.length());
	System.out.println( "s2: " + s1.length());
	
	String s2 = s+s1;
	System.out.println("s2: " + s2);
	
	System.out.println("index(3): " + s.charAt(3));
	for(int i = 0; i< s.length(); i++) {
		System.out.println("text:"+s.charAt(i));
		
	}
	
	System.out.println("indexOf: " + s.indexOf("A"));
	System.out.println("lastIndeOf"+ s.lastIndexOf("A"));
	
	
	}
	
	

}
