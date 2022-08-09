
public class Bai6 {
	public static int calIndexStart(int k)
	{
		int index =1;
		int countNumber = 0;
		int result=0;
		while(k >= 10)
		{
			k/=10;
			index*=10;
			countNumber++;
		}
		while(countNumber != 0)
		{
			result += (index - (index/10))*countNumber;
			countNumber--;
			index /= 10;
		}
		return result;
	}
	public static int calHop(int k)
	{
		int hop = 0;
		while(k>0)
		{
			hop++;
			k/=10;
		}
		return hop;
	}
	public static void printIndexofValue(String s,String k)
	{
		Integer hop = calHop(Integer.parseInt(k));
		int indexStart = calIndexStart(Integer.parseInt(k));
		int start =indexStart , end = indexStart + hop;
		
		while(true)
		{
			if(s.substring(start, end).equals(k))
			{
				System.out.println(start);
				break;
			}else
			{
				start +=hop ; end+=hop;
			}
			
		}
	}
	public static void main(String[] args) {
		printIndexofValue("1234567891011121314151617181920212223242526272829303132333435363738394041424344454647484950"
				+ "51525354555657585960616263646566676869707172737475767778798081828384858687888990919293949596979899100101","101");
		
		
	}

}
