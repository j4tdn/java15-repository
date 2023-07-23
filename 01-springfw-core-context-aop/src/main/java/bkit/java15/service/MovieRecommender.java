package bkit.java15.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// khởi tạo bean thông qua class
// yêu cầu: thêm annotation @Component ở trên class
@Component
public class MovieRecommender {
	
	// khi bean đã tồn tại trong IOC
	// và class này chỉ có 1 bean duy nhất --> @Autowired
	
	// IOC: inversion of control --> thay vì tự new khởi tạo object --> khởi tạo thông qua bean trong ioc
	// DI: dependency inject --> tiêm sự phụ thuộc cho class bằng cách lấy bean trong ioc
	
	// Mục đích
	/*
	 + Code ngắn gọn hơn
	   . Chỉ khởi tạo object 1 lần chỗ spring bean config
	   . Chỗ nào cần thì @Autowired để lấy ra
	 
	 + Khởi tạo bean, config hết tất cả mọi thứ chỗ config
	   . Tách code khởi tạo và sử dụng ra
	   . Sử dụng các bean có sẵn của spring
	 */
	
	// Inject via setter
	// @Autowired
	// @Qualifier("movieCatalogAdventure")
	private MovieCatalog moveCatalog;

	// Inject via constructor
	@Autowired
	public MovieRecommender(@Qualifier("movieCatalogAdventure") MovieCatalog moveCatalog) {
		this.moveCatalog = moveCatalog;
	}
	
	public void recommend() {
		System.out.println("MovieRecommend#recommend");
		moveCatalog.recommend();
	}
	
}
