package view;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import persistence.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;

public class BatchUpdateDemo {

	private static final String PATH = "loaihang.txt";
	
	private static ItemGroupService itemGroupSerivce;
	
	static {
		itemGroupSerivce = new ItemGroupServiceImpl();
	}

	public static void main(String[] args) throws IOException {
		List<ItemGroup> itemGroups = readFile();
		itemGroupSerivce.save(itemGroups);
	}

	/*
	    86881, Item Group 86881
		86882, Item Group 86882
		86883, Item Group 86883
		86884, Item Group 86884
		86885, Item Group 86885
	 */
	private static List<ItemGroup> readFile() {
		try {
			return Files.readAllLines(
					new File(PATH).toPath())
					.stream().map(ItemGroup::new)
					.collect(Collectors.toList());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return Collections.emptyList();
	}
}
