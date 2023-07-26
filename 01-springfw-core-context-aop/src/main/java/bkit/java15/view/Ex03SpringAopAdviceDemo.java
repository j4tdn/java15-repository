package bkit.java15.view;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bkit.java15.service.MovieService;
import java15.bkit.utils.IocUtils;

public class Ex03SpringAopAdviceDemo {
	
	private static final String AOP_PATH = "2. Spring AOP - join point advice proxy.xml";
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(AOP_PATH);
		
		IocUtils.printIocBeanNames(context);
		
		MovieService movieService = context.getBean("movieServiceProxy", MovieService.class);
		movieService.printName();
		movieService.printCatalog();
		
		context.close();
	}
}
