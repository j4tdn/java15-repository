package mutable;

public class SoSanhBuildervsBuffer {
	public static void main(String[] args) throws InterruptedException {
		//Mutable: StringBuilder - StringBuffer
		MutableTask task = new MutableTask();
		
		Thread tA =new Thread(task,"Thread-A");
		tA.start();
		
		Thread tB =new Thread(task,"Thread-B");
		tB.start();
		
		//make sure Thread A finish then go to thread main
		tA.join();
		tB.join();
		
		System.out.println("length: "+ task.length());		
	}
	
	public static class MutableTask implements Runnable{
		//mutiple threads accsess this task with share data
		//share data : StrungBuilder, StringBuffer
		
		private StringBuffer mutable;
		//private StringBuilder mutable;
		private int count = 50000;
		
		public MutableTask() {
			mutable = new StringBuffer();
			//mutable = new StringBuilder();
		}
		
		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName() + " is runing");
			for (int i = 1;i<= count;i++) {
				mutable.append("a");
			}
		}
		
		
		public int length() {
			return mutable.length();
		}
		
	}
	
}
