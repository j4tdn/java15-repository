package bkit.java15.view;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import bkit.java15.configuration.SpringBeanConfig;
import bkit.java15.service.MovieCatalog;
import bkit.java15.utils.IocUtils;

public class Ex02SpringBeansAnnotationDemo {
	private static final Class<?> SPRING_BEANS_METADATA_PATH = SpringBeanConfig.class;

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(SPRING_BEANS_METADATA_PATH);

		IocUtils.printIocBeanNames(context);

		System.out.println("\n ========= Test Call Bean Methods ============ \n");

		MovieCatalog movieCatalog = context.getBean("movieCatalog", MovieCatalog.class);
		movieCatalog.recomend();;

		context.close();
	}
}
