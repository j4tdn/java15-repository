package view;

public class Ex00TestClosure {
   public static void main(String[] args) {
	Runnable runnable = test(15);
	runnable.run();
}
   public static Runnable test(int time) {
	   String running = " running ...";
	   return new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Tom is " + running + " " + time + "ms");
		}
	};
   }
}
