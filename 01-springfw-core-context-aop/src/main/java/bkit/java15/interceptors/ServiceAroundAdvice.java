package bkit.java15.interceptors;

import java.util.concurrent.TimeUnit;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class ServiceAroundAdvice implements MethodInterceptor{
	
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		String methodName = invocation.getMethod().getName();
		
		System.out.println("\n");
		System.out.println("** Title: Ready to call " + methodName + " **");
		int counter = 3;
		while(counter > 0) {
			System.out.println(counter);
			sleep(1);
			counter--;
		}
		System.out.println("-------------");

		Object result = invocation.proceed();
		
		System.out.println("-------------");
		System.out.println(">> " + methodName + " is finished !!! \n");
		
		return result;
	}
	
	private static void sleep(int second) {
		try {
			TimeUnit.SECONDS.sleep(second);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
