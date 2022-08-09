
public class Bai1 {
	
	public static void printChar(String s)
	{
		for(int i=0 ;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
	}
	public static void printWord(String s)
	{
		String[] result = s.split("\\s+");
		for(int i=0 ;i<result.length;i++)
		{
			System.out.println(result[i]);
		}
 	}
	public static void printReverseChar(String s)
	{
		System.out.println((new StringBuffer(s)).reverse().toString());
	}
	public static void printReverseWord(String s)
	{
		String[] Words = s.split("\\s+");
		StringBuffer result = new StringBuffer();
		for(String i : Words)
		{
			String temp = (new StringBuffer(i)).reverse().append(" ").toString();
			result.append(temp);
		}
		System.out.println(result.toString().trim());
	}
	public static void main(String[] args) {
		printChar("Xin chào");
		printWord("Xin chào");
		printReverseChar("Xin chào");
		printReverseWord("Xin chào");

	}
	
	

}
