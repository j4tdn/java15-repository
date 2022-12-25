package service;

import java.util.List;

import persistence.ItemGroup;
import persistence.ItemGroupDto;

public interface ItemGroupService {
	List<ItemGroup> getAll();

	List<ItemGroup> getItemGroupDetails();

	List<ItemGroupDto> getItemGroups();

	ItemGroup get(int id);

	List<ItemGroup> search(String name);

	void save(List<ItemGroup> itemGroups);

	void saveOrUpdate(ItemGroup itemGroup);

}
