package service;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;

import persistence.ItemDtoV2;
import persistence.ItemDtoV3;
import persistence.ItemDtoV4;

public interface ItemService {
	 List<ItemDtoV2> getItems(LocalDate deliveryDate);
	 List<ItemDtoV3> getItemWithHighestPrice();
	 List<ItemDtoV4> getHotItems(int findingYear);
}
