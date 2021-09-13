package com.cbstyle.item.service;

import com.cbstyle.common.crudcore.service.CrudService;
import com.cbstyle.item.model.Category;
import com.cbstyle.item.model.Item;
import com.cbstyle.item.model.ItemDto;

import java.util.List;
import java.util.Map;

public interface ItemService extends CrudService<ItemDto, Item> {

    List<ItemDto> readBy(Category category);
}
