package java15.bkit.utils;

import org.springframework.context.ApplicationContext;

public class IocUtils {
	
	private IocUtils() {
	}
	
	public static void printIocBeanNames(ApplicationContext context) {
		String[] beanNames = context.getBeanDefinitionNames();
		for (int i = 0; i < beanNames.length; i++) {
			System.out.println((i+1) + ". Bean Name --> '" + beanNames[i] + "'");
		}
	}
	
}