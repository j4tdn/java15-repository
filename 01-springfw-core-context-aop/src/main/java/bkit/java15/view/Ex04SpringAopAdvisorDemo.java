package bkit.java15.view;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bkit.java15.service.MovieService;
import bkit.java15.utils.IocUtils;

public class Ex04SpringAopAdvisorDemo {
	
	private static final String AOP_PATH = " 3. Spring AOP - join point advisor proxy.xml";
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(AOP_PATH);
		
		IocUtils.printIocBeanNames(context);
		
		
		// get bean of proxy -> return target of proxy = join point
		MovieService movieService = context.getBean("movieServiceProxy", MovieService.class);
		movieService.printName();
		movieService.printMovieCatalog();
		context.close();
		
	}
}
