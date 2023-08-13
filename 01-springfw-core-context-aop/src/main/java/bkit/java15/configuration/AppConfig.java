package bkit.java15.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = { MovieConfig.class, StoreConfig.class })
@ComponentScan(basePackages = "bkit.java15")
@EnableAspectJAutoProxy
public class AppConfig {

}
