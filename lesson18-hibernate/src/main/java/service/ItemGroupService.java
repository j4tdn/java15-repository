package service;

import java.util.List;

import dto.ItemGroupDto;
import persistence.ItemGroup;

public interface ItemGroupService {
	List<ItemGroup> getAll();
	void saveOrUpdate(ItemGroup itemGroup);
	List<ItemGroupDto> getItemGroups();
	void demo1stLevelCache();
}