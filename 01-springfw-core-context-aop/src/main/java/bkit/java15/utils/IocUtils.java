package bkit.java15.utils;

import org.springframework.context.ApplicationContext;

public class IocUtils {
	public IocUtils() {
		// TODO Auto-generated constructor stub
	}
	public static void printIocBeanNames(ApplicationContext context) {
		String[] beanNames = context.getBeanDefinitionNames();
		for (int i =0; i < beanNames.length; i++) {
			System.out.println( (i+1) + "--->"+ beanNames[i]);
		}
	}
}
