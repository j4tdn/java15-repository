package viwer;

public class Ex02 {
	static int extractMaximum(String str)
    {
        int num = 0, res = 0;
      
        for (int i = 0; i<str.length(); i++)
        {
            if (Character.isDigit(str.charAt(i)))
                num = num * 10 + (str.charAt(i)-'0');
            else
            {
                res = Math.max(res, num);
      
                num = 0;
            }
        }
      
        return Math.max(res, num);
    }
     
    public static void main(String[] args)
    {
        String str = "xâu 01a2b3456cde478";
        System.out.println(extractMaximum(str));
    }   
}

