package bkit.java15.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import bkit.java15.common.Catalog;
import bkit.java15.service.MovieCatalog;

@Configuration
public class MovieConfig {

	// khởi tạo bean thông qua method
	// yêu cầu: khai báo method trong class(ioc) chứa annotation là @Configuration
	// default bean name = method name
	@Bean
	@Scope("prototype") // singleton
	public MovieCatalog movieCatalogAction() {
		MovieCatalog movieCatalog = new MovieCatalog(Catalog.ACTION);
		return movieCatalog;
	}

	@Bean
	// @Primary --> đưa mức độ ưu tiên lên đầu cho bean trong class
	public MovieCatalog movieCatalogAdventure() {
		MovieCatalog movieCatalog = new MovieCatalog(Catalog.ADVENTURE);
		return movieCatalog;
	}

}
