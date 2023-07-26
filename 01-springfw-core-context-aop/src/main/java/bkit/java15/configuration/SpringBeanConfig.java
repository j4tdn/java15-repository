package bkit.java15.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = MovieConfig.class)
@ComponentScan(basePackages = "bkit.java15")
public class SpringBeanConfig {

}
