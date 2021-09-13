package com.cbstyle.item.service;

import com.cbstyle.common.crudcore.service.BaseCrudService;
import com.cbstyle.item.mappers.ItemDtoToEntityMapper;
import com.cbstyle.item.mappers.ItemEntityToDtoConverter;
import com.cbstyle.item.model.Category;
import com.cbstyle.item.model.Item;
import com.cbstyle.item.model.ItemDto;
import com.cbstyle.item.repository.ItemRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ItemServiceImpl extends BaseCrudService<
        ItemDto,
        Item,
        ItemRepository,
        ItemDtoToEntityMapper,
        ItemEntityToDtoConverter> implements ItemService {

    @Override
    public List<ItemDto> readBy(Category category) {
        Iterable<Item> entities  = repository.findByCategory(category.toString());
        List<ItemDto> dtoList =  entityToDtoConverter.convert(entities);
        log.info("Read items of size: {}", dtoList.size());
        return dtoList;

    }
}
