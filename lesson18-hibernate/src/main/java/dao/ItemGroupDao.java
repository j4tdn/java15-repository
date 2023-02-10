package dao;

import java.util.List;

import dto.ItemGroupDto;
import persistence.ItemGroup;

public interface ItemGroupDao {
	List<ItemGroup> getAll();
	
	List<ItemGroupDto> getItemGroups();

	void saveOrUpate(ItemGroup itemGroup);

	void demo1stLevelCache();
}

