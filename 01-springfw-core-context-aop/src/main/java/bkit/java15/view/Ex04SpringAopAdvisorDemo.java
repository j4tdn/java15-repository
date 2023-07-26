package bkit.java15.view;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bkit.java15.service.MovieService;
import java15.bkit.utils.IocUtils;

public class Ex04SpringAopAdvisorDemo {
	
	private static final String AOP_PATH = "3. Spring AOP - join point advisor proxy.xml";
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(AOP_PATH);
		
		IocUtils.printIocBeanNames(context);
		
		System.out.println("\n====================");
		
		MovieService movieService = context.getBean("movieServiceProxy", MovieService.class);
		movieService.printName();
		movieService.printCatalog();
		
		context.close();
	}
}
