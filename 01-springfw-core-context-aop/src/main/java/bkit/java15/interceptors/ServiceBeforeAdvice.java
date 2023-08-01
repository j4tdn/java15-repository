package bkit.java15.interceptors;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.springframework.aop.MethodBeforeAdvice;

public class ServiceBeforeAdvice implements MethodBeforeAdvice{
	@Override
	public void before(Method method, Object[] args, Object arg) throws Throwable {
		System.out.println("\n");
		System.out.println("** Title: Ready to call " + method.getName() + "**");
		int counter = 3;
		while (counter > 0) {
			System.out.println(counter);
			sleep(1);
			counter--;
		}
		System.out.println("\n");
	}
	
	private static void sleep(int second) {
		try {
			TimeUnit.SECONDS.sleep(second);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
