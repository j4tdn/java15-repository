package service;

import java.util.List;

import persistence.ItemGroup;

public interface ItemGroupService{
	List<ItemGroup> getAll();
	List<ItemGroup> getItemGroupDetails();
	ItemGroup get(int id);
	List<ItemGroup> search(String name);
	void saveOrUpdate(ItemGroup itemGroup);
}
