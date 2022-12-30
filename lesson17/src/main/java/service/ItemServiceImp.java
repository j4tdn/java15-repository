package service;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;

import dao.ItemDao;
import dao.JdbcItemDao;
import persistence.ItemDtoV2;
import persistence.ItemDtoV3;
import persistence.ItemDtoV4;

public class ItemServiceImp implements ItemService {
	public ItemDao itemDao;

	public ItemServiceImp() {
		itemDao = new JdbcItemDao();
	}

	@Override
	public List<ItemDtoV2> getItems(LocalDate deliveryDate) {
		Objects.requireNonNull(deliveryDate,"deliveryDate cannot be null");
		return itemDao.getItems(deliveryDate);
	}

	@Override
	public List<ItemDtoV3> getItemWithHighestPrice() {
		// TODO Auto-generated method stub
		return itemDao.getItemWithHighestPrice();
	}

	@Override
	public List<ItemDtoV4> getHotItems(int findingYear) {
		Objects.requireNonNull(findingYear, "Year cannot be null");
		return itemDao.getHotItems(findingYear);
	}
	
}
