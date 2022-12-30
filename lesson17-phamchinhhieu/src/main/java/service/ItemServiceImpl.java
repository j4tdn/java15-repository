package service;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;

import dao.ItemDao;
import dao.JdbcItemDao;
import persistence.Item;
import persistence.ItemDto;
import persistence.ItemDtoByIG;

public class ItemServiceImpl implements ItemService {
	private ItemDao itemDao;
	
	public ItemServiceImpl() {
		itemDao = new JdbcItemDao();
	}
	
	

	@Override
	public List<ItemDto> getItemsbyDate(LocalDate deliveryOrder) {
		return itemDao.getItemsbyDate(deliveryOrder);
	}
	@Override
	public List<String> getTop3Items(Integer year) {
		 List<ItemDto> items = itemDao.getTop3Items(year);
		 return items.stream().map(ItemDto::getName)
		.collect(Collectors.toList());
	}
	@Override
	public List<ItemDtoByIG> getItemsByIG() {
		return itemDao.getItemsByIG();
	}
}
