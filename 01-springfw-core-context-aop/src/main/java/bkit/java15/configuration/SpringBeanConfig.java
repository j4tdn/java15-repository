package bkit.java15.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import bkit.java15.common.Catalog;
import bkit.java15.service.MovieCatalog;

@Configuration
public class SpringBeanConfig {
	@Bean(name= "movie CatalogAction")
	public MovieCatalog movieCatalog() {
		return new MovieCatalog(Catalog.ACTION);
	}
}
