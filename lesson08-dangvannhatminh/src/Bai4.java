
public class Bai4 {
	public static boolean checkPrimeNumber(int numb)
	{
		for(int i=2; i < numb;i++)
		{
			if(numb % i == 0 ) return false;
		}
		return true;
	}
	public static void checkEqualPrimeNumber(int a,int b)
	{
		int minNumber = Math.min(a, b);
		for (int i=2; i<=minNumber; i++)
		{
			if(!checkPrimeNumber(i)) continue;
			if(b % i != 0) continue;
			if(a % i != 0)
			{
				System.out.println(a + " và " + b + " không là nguyên tố tương đương");
				return;
			}
		}
		System.out.println(a + " và " + b + " là nguyên tố tương đương");
	}
	public static void main(String[] args) {
		checkEqualPrimeNumber(75, 15);

	}

}
