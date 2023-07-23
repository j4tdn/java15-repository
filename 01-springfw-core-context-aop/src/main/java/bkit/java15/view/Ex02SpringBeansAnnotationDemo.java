package bkit.java15.view;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import bkit.java15.configuration.SpringBeanConfig;
import bkit.java15.service.MovieCatalog;
import bkit.java15.service.MovieRecommender;
import java15.bkit.utils.IocUtils;

public class Ex02SpringBeansAnnotationDemo {

	private static final Class<?> SPRING_BEANS_METADATA_PATH = SpringBeanConfig.class;

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(SPRING_BEANS_METADATA_PATH);

		IocUtils.printIocBeanNames(context);
		
		System.out.println("\n ========= Test Call Bean Methods ============ \n");
		
		MovieRecommender movieRecommender = context.getBean("movieRecommender", MovieRecommender.class);
		movieRecommender.recommend();
		
		System.out.println("\n ========= Test Bean Scopes ============ \n");
		MovieCatalog movieCatalogA1 = context.getBean("movieCatalogAction", MovieCatalog.class);
		MovieCatalog movieCatalogA2 = context.getBean("movieCatalogAction", MovieCatalog.class);
		
		System.out.println("movieCatalogA1 --> " + System.identityHashCode(movieCatalogA1));
		System.out.println("movieCatalogA2 --> " + System.identityHashCode(movieCatalogA2));

		context.close();
	}
}
