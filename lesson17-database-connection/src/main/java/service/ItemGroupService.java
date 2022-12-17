package service;

import java.util.List;

import persistence.Item;
import persistence.ItemDetail;
import persistence.ItemGroup;
import persistence.ItemGroupDto;

public interface ItemGroupService {
	List<ItemGroup> getAll();
List<ItemGroupDto> getItemgroups();
	ItemGroup get(int id);

	List<ItemGroup> getIg();

	void saveOrUpdate(ItemGroup itemGroup);

	List<ItemGroup> search(String name);

	void store(ItemDetail itemDetail);
}
