package view;

public class Ex02Sum {
	
		public static void main(String[] args) {
			System.out.println(sum());
		}
		private static long sum(){
			long x=1 ,sum1 = 0;
			for(int i=2;i<=18;i++) {
				x*=i;
				if(i==4 || i == 7 || i== 12 || i == 18) sum1+=x;
			}
			return sum1;
		}
	}


