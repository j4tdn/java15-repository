package bkit.java15.interceptors;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

// Demo aspectJ --> aspect = advisor(advise + point cut)
@Aspect
public class StoreLogAspect {
	
	@Before("execution(* bkit.java15.service.StoreService.*(*))")
	public void runBeforeAdvice() {
		System.out.println(">>> LOG INFO: something run before 'addStore' method");
	}
}
