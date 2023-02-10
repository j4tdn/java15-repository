package service;

import java.util.List;

import persistence.ItemGroup;
import persistence.ItemGroupDto;

public interface ItemGroupService {
	List<ItemGroup> getAll();
    List<ItemGroupDto> getItemGroups();
	List<ItemGroup> getItemGroupDetails();
	ItemGroup get(int id);
	List<ItemGroup> search (String name);
	void saveOrUpdate(ItemGroup itemGroup);

}
