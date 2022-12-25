package view;

import java.io.File;
import java.nio.file.Files;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import persistence.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceImp;

public class BatchUpdateDemo {
	private static final String PATH = "loaihang.txt";
	
	private static ItemGroupService itemGroupService;
	static {
		itemGroupService = new ItemGroupServiceImp();
	}
	public static void main(String[] args) {
		List<ItemGroup> resources = readFile();
         itemGroupService.save(resources);
	}
	/*
	 * 86881 , Itemgroup 86681
	 * 86882 , Itemgroup 86682
	 * 86883 , Itemgroup 86683
	 * 86884 , Itemgroup 86684
	 * 86885 , Itemgroup 86685
	 */
	
	private static List<ItemGroup> readFile(){
		try {
			return Files.readAllLines(new File(PATH).toPath())
					.stream()
					.map(ItemGroup::new)
					.collect(Collectors.toList());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Collections.emptyList();
	}
}
