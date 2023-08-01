package bkit.java15.view;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bkit.java15.service.MovieService;
import bkit.java15.utils.IocUtils;

public class Ex05SpringAopAutoProxyDemo {
	
	private static final String AOP_PATH = " 4. Spring AOP - join point advisor auto proxy.xml";
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(AOP_PATH);
		
		IocUtils.printIocBeanNames(context);
		
		
		// get bean itself base on advisor to add aspect
		MovieService movieService = context.getBean("movieService", MovieService.class);
		movieService.printName();
		movieService.printMovieCatalog();
		movieService.insertMovie();
		
		
		context.close();
		
	}
}
