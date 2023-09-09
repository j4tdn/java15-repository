package bkit.java15.interceptors;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

// Demo AspectJ --> Aspect = Advisor(Advise + PointCut)
@Aspect
public class StoreLogAspect {
	
	@Before("execution(* bkit.java15.service.StoreService.*(..))")
	public void runBeforeAdvice() {
		System.out.println("\n>>> LOG info: something run before StoreService method");
	}
	
	@After("execution(* bkit.java15.service.StoreService.*(*))")
	public void runAfterAdvice() {
		System.out.println(">>> LOG info: something run after StoreService method with one parameter\n");
	}
	
}
