package mutable;

public class Ex03 {
	public static void main(String[] args) {
		// Thread
		// Default
		System.out.println("Ex02#main-start");
		System.out.println(Thread.currentThread().getName() + "is running");
	
		Task task = new Task();
		task.run();
		
		System.out.println("Ex02#main-end");
	}

	public static class Task implements Runnable {
		@Override
		public void run() {
			System.out.println("Task#run...");
		}
	}
}
