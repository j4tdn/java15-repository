package bkit.java15.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import bkit.java15.interceptors.StoreLogAspect;
import bkit.java15.service.StoreService;

@Configuration
public class StoreConfig {
	
	@Bean
	public StoreService storeService() {
		return new StoreService();
	}
	
	@Bean
	public StoreLogAspect storeLogAspect() {
		return new StoreLogAspect();
	}
}
