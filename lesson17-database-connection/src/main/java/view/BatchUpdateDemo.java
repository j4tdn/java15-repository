package view;

import java.io.File;
import java.nio.file.Files;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import persistence.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;

public class BatchUpdateDemo {
	
	private static final String PATH = "loaihang.txt";
	
	private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
		List<ItemGroup> itemGroups = readFile();
		itemGroupService.save(itemGroups);
	}
	
	private static List<ItemGroup> readFile(){
		try {
			return Files.readAllLines(
					new File(PATH).toPath())
					.stream().map(ItemGroup::new)
					.collect(Collectors.toList());
		}catch (Exception e) {
			e.printStackTrace();
		}
		return Collections.emptyList();			
	}
}
