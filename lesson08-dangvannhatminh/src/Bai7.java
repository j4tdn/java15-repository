
public class Bai7 {
	public static void printShortAndLongString(String s)
	{
		
		String shortStr = "";
		String longStr = "";
		if (s.length() <= 1) shortStr = longStr = s;
		else shortStr = longStr = s.substring(0,1);
		int start = 0 , end = 1;
		
		while(end < s.length())
		{
			if(s.charAt(end) != s.charAt(end-1)) {
				start = end++;
				continue;
			}
			end++;
			String temp = s.substring(start,end);
			longStr = (Math.max(longStr.length(), temp.length()) > longStr.length()) ? temp : longStr;				
			shortStr = (Math.min(shortStr.length(), temp.length()) < shortStr.length()) ? temp : shortStr;
		}
		System.out.println(shortStr + " " + longStr);
	}
	public static void main(String[] args) {
		printShortAndLongString("aaabaaabbaaaaa");

	}

}
