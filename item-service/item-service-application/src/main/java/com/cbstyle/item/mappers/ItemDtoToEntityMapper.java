package com.cbstyle.item.mappers;

import com.cbstyle.common.crudcore.mappers.Mapper;
import com.cbstyle.item.model.Item;
import com.cbstyle.item.model.ItemDto;
import org.springframework.stereotype.Component;

@Component
public class ItemDtoToEntityMapper implements Mapper<ItemDto, Item> {

    public void map(ItemDto dto, Item entity) {
        entity.setCategory(dto.getCategory());
        entity.setColor(dto.getColor());
        entity.setSize(dto.getSize());
        entity.setBrand(dto.getBrand());
        entity.setStyle(dto.getStyle());
    }
}
