
public class Bai5 {
	
	public static void swap(String a, String b)
	{
		String temp = a;
		a=b;
		b=temp;
	}
	public static void printLongestSubString(String a, String b)
	{
		int start =0,end =0;
		String rs = "";
		if (a.length() > b.length()) swap(a,b); 
		while(end < b.length())
		{
			String temp = b.substring(start,end);
			if(a.contains(temp))
			{
				rs = (Math.max(rs.length(), temp.length()) > rs.length()) ? temp : rs;				
			} else {
				start++;
			}
			end++;
		}
		System.out.println(rs);
	}
	public static void main(String[] args) {
		printLongestSubString("ABCEDEABC","ABCEDCBBCK");
		

	}

}
