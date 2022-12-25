package service;

import java.time.LocalDate;
import java.util.List;

import persistence.Item;

public interface ItemService {
	List<Item> getItems(LocalDate orderDate);
	List<Item> getTop3(int orderYear);
}
