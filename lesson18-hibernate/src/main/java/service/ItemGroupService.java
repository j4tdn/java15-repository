package service;

import java.util.List;

import dto.ItemGroupDto;
import persistence.ItemGroup;

public interface ItemGroupService {
	List<ItemGroup> getAll();

	List<ItemGroupDto> getItemGroups();
	
	void saveOrUpdate(ItemGroup itemGroup);

	void demo1stLevelCache();
}
