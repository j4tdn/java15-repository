package view;

public class Ex00TestClosure {
	public static void main(String[] args) {
		Runnable runnable = test(15);
		runnable.run();
	}
	
	public static Runnable test(int time) {
		// nested object which is called in lambda
		// copy initial value and store in lambda
		// --> running --> closure variable
		String running = "running ...";
		return new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Tom is " + running + " " + time + " ms"); 
			}
		};
	}
}
