package bkit.java15.interceptors;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class ServiceAfterAdvice implements AfterReturningAdvice{
	
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println(">> " + method.getName() + " is finished!");
	}
}
