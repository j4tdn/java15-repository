package bkit.java15.configuration;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "bkit.java15.controller")
public class WebAppConfigurer implements WebMvcConfigurer {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("resources/**")
				.addResourceLocations("/static/");
	}

	@Bean
	public ViewResolver viewResolver() {
		var internalViewResolver = new InternalResourceViewResolver();
		internalViewResolver.setPrefix("/view/");
		internalViewResolver.setSuffix(".jsp");
		return internalViewResolver;
	}
	
	@Bean
	public MessageSource messageSource() {
		var resourceBundle = new ResourceBundleMessageSource();
		resourceBundle.setBasename("MessageResource");
		return resourceBundle;
	}
}
