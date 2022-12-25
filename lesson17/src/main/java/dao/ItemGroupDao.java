package dao;

import java.util.List;

import persistence.ItemDto;
import persistence.ItemGroupDto;

public interface ItemGroupDao {
    List<ItemGroupDto> getAll();
}
