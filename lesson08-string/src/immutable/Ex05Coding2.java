package immutable;

public class Ex05Coding2 {
	public static void main(String[] args) {
       String s = "today is a good day";
       String s1 = "day";
       
       //1
       System.out.println("" + s.startsWith(s1));
       System.out.println("" + s.endsWith(s1));
       //2
       s1 = "good";
       String s2 = "great";
       System.out.println(s.replace(s1, s2));
       //3
       String s3 = "hope you       have a great working day";
       s3 = s3.replaceAll("\\s+", " ");
       System.out.println(s3);
       //4
       String s4 = s.substring(2 ,5);
       System.out.println(s4);
       //5
       s1 = "today";
       System.out.println("" + s1.contains(s4));
	}
}
