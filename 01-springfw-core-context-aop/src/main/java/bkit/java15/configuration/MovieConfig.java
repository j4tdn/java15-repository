package bkit.java15.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import bkit.java15.common.Catalog;
import bkit.java15.service.MovieCatalog;

@Configuration
public class MovieConfig {
	// khởi tạo bean thông qua method
		// Yêu cầu: khai báo method trong class(ioc) chứa annotation là @Configuration
		// default bean name = method name
		@Bean
		@Scope("prototype") // singleton iss default
		public MovieCatalog movieCatalogAdventure() {
			return new MovieCatalog(Catalog.ADVENTURE);
		}
		
		@Bean
		public MovieCatalog movieCatalogAction() {
			return new MovieCatalog(Catalog.ACTION);
		}
}
