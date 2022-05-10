package view;

public class Ex02Sum {
	public static void main(String[] args) {
          long result = process(4) + process(7) + process(12) + process(18);
          System.out.println("result: " + result);
	}

	private static long process(int n) {
		  long k = 1;
          for(int i=1;i<=n;i++) k*=i;
          return k;
	}
}
