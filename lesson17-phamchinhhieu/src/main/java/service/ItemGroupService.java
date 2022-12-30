package service;

import java.util.List;

import persistence.ItemGroup;
import persistence.ItemGroupDto;

public interface ItemGroupService {

	List<ItemGroupDto> getItemGroups();

	void save(List<ItemGroup> itemGroups);
	
}
