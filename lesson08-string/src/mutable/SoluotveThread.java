package mutable;

import java.util.concurrent.TimeUnit;

public class SoluotveThread {
	public static void main(String[] args) {
		//Thread
		//default: single thread - thread main
		System.out.println("Thread#main - start");
		
		System.out.println(Thread.currentThread().getName()+" is runing");
		
		Task task = new Task();
		Thread t0 = new Thread(task,"thread-01");
		t0.start();
		
		try {
			TimeUnit.SECONDS.sleep(2);//stop 2s
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread#main - end");
	}
	
	//thread execute task - runnable
	public static class Task implements Runnable{
		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName()+" is runing");
			System.out.println("task#run");
		}
	}
	
}
