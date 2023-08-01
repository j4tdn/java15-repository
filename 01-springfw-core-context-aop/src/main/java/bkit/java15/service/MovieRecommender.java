package bkit.java15.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


// Khởi tạo bean thông qua class
// yêu cầu: thêm annotation @Component ở trên class
@Component
public class MovieRecommender {
	
	// Khi bean đã tồn tại trong IOC
	// và class này chỉ có 1 bean duy nhất --> @Autowired
	
	// IoC: Inversion of Control --> thay vì tự new khởi tạo object --> khởi tạo thông qua bean trong IoC
	// DI: dependency inject --> tiêm sự phụ thuộc cho class bằng cách lấy bean trong ioc
	
	// Mục đích
	/*
	 	+ Code ngắn gọn hơn
	 		. Chỉ khởi tạo object 1 lần chỗ spring bean config
	 		. Chỗ nào cần sử dụng thì @Autowired để lấy ra sử dụng
	 	+ Khởi tạo bean, config mọi thứ ở package config
	 		. Tách code, dễ sử dụng và bảo trì
	 * */
	
	// Inject via setter
	@Autowired
	@Qualifier("movieCatalogAdventure")
	private MovieCatalog movieCatalog;
	
	// Inject via constructor
	@Autowired
	public MovieRecommender(@Qualifier("movieCatalogAdventure") MovieCatalog movieCatalog) {
		this.movieCatalog = movieCatalog;
	}
	
	public void recomend() {
		System.out.println("MovieRecommend#recommend");
		movieCatalog.recomend();
	}
}
