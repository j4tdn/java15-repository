package view;

public class Ex06Prime {
	private static int check(int n) {
          int i;
          if(n == 0 && n == 1) return 0;
          for(i=2;i<n;i++) {
        	  if(n%i == 0) return 0;
          }
          return 1;
	}

	public static void main(String[] args) {
          int count = 0, i=1;
          while(count != 200){
        	  i++;
        	  if(check(i) == 1) count++;
          }
          System.out.println("So nguyen to thu 200: " + i);
	}
}
