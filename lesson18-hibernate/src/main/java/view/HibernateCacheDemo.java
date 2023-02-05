package view;

import service.ItemGroupService;
import service.ItemGroupServiceImpl;

public class HibernateCacheDemo {
	
	private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
		itemGroupService.demo1stLevelCache();
	}
}
