
public class Bai2 {
	public static boolean checkChar(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) == ' ') continue;
			if((s.charAt(i) > 'Z' && s.charAt(i) <'a') || s.charAt(i) < 'A' || s.charAt(i) > 'z')
			{
				return false;
			}
		}
		return true;
	}
	public static void printChangeString(String s)
	{
		if(!checkChar(s))
		{
			System.out.println("Tên không hợp lệ");
		}else
		{			
			String[] words = s.split("\\s+");
			StringBuffer result = new StringBuffer();
			for(String i : words)
			{
				String newWord = (new StringBuffer()).append(i.substring(0, 1).toUpperCase())
														.append(i.substring(1,i.length()).toLowerCase())
														.append(" ")
														.toString();
				result.append(newWord);				
			}
			System.out.println(result.toString().trim());
			
		}
		
 	}
	public static void main(String[] args) {
		printChangeString("aDam Le vAN john   Son");
		
	}

}
