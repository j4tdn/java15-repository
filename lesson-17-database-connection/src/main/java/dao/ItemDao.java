package dao;

import java.util.List;

import persistence.Item;

public interface ItemDao {
	List<Item> getItems(String igName);
	
    List<Item> getAll();
    
	

}
