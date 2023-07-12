package bkit.java15.view;

import java.util.stream.Stream;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bkit.java15.bean.Item;
import bkit.java15.bean.ItemGroup;
import bkit.java15.service.ClientService;
import java15.bkit.utils.IocUtils;

public class Ex01SpringBeansXmlDemo {
	
	private static final String SPRING_BEANS_METADATA_PATH = "1. Spring Beans.xml";

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(SPRING_BEANS_METADATA_PATH);
		
		IocUtils.printIocBeanNames(context);
		
		// ========== Ioc is ready to use =========== //
		
		ItemGroup ig1 = context.getBean("igA", ItemGroup.class);
		ItemGroup ig2 = context.getBean("igB", ItemGroup.class);
		ItemGroup ig3 = context.getBean("igC", ItemGroup.class);
		Item itemB1 = context.getBean("itemB1", Item.class);
		
		System.out.println("\n ========= Print Bean Values ============ \n");
		
		Stream.of(ig1, ig2, ig3, itemB1).forEach(System.out::println);
		
		System.out.println("\n ========= Test Call Bean Methods ============ \n");
		
		ClientService clientService = context.getBean("clientServiceA", ClientService.class);
		clientService.printClientStringId();
		
		context.close();
	}
}
