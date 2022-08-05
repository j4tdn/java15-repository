package thread.core;

import static utils.ThreadUtils.*;

import java.util.concurrent.TimeUnit;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("main start");
		// current thread
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// prepare date took 2s
			//	task(2, TimeUnit.SECONDS );
				printCurrendThreadName();
				System.out.println("running a task ...");
			}
		}, "thread1");
		t1.run(); 
		// gọi đến hàm run của Thread --> gọi đến hàm run của Runnable
		printCurrendThreadName();
		System.out.println("main end");
	}
}
