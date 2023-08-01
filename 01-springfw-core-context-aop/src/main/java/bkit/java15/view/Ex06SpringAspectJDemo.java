package bkit.java15.view;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import bkit.java15.configuration.AppConfig;
import bkit.java15.service.StoreService;
import bkit.java15.utils.IocUtils;

public class Ex06SpringAspectJDemo {
	private static final Class<?> SPRING_BEANS_METADATA_PATH = AppConfig.class;

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(SPRING_BEANS_METADATA_PATH);

		IocUtils.printIocBeanNames(context);

		System.out.println("\n ========= Test Spring AspectJ s============ \n");
		
		StoreService storeService = context.getBean(StoreService.class);
		storeService.addStore();
		storeService.updateStore(221);
		storeService.getStoreName();
		
		context.close();
	}
}
